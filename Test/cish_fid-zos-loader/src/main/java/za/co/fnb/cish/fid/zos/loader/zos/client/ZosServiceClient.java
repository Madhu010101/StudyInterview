package za.co.fnb.cish.fid.zos.loader.zos.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import za.co.fnb.cish.fid.common.api.common.*;
import za.co.fnb.cish.fid.common.api.exception.FidServiceException;
import za.co.fnb.cish.fid.common.api.exception.ZosErrorException;
import za.co.fnb.cish.fid.repo.repository.events.EventLogsRepository;
import za.co.fnb.cish.fid.zos.loader.security.jwt.JWTService;
import za.co.fnb.cish.fid.zos.loader.service.impl.EvenLogsImpl;
import za.co.fnb.cish.fid.zos.loader.util.Constants;
import za.co.fnb.cish.fid.zos.loader.util.LogExecutionTime;

import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import static za.co.fnb.cish.fid.zos.loader.util.Constants.CIS_CHANNEL_ID;


public class ZosServiceClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZosServiceClient.class);
    @Autowired
    EvenLogsImpl evenLogsImpl;
    ObjectMapper objectMapper;
    private RestTemplate restTemplate;
    @Value("${gateway.pep3.jwt.kid}")
    private String kid;
    @Value("${gateway.pep3.jwt.iss}")
    private String iss;
    @Value("${gateway.pep3.jwt.expSeconds}")
    private int expSeconds;
    @Value("${gateway.pep3.jwt.pkPath}")
    private String pkPath;
    @Value("${gateway.zosconnect.useBasicAuth}")
    private boolean useBasicAuth;
    @Value("${gateway.zosconnect.login}")
    private String basicAuthLogin;
    @Value("${gateway.zosconnect.password}")
    private String basicAuthPasss;
    @Value("${gateway.zosconnect.header.branch}")
    private Integer branch;
    @Value("${gateway.zosconnect.header.terminal}")
    private Integer terminal;
    @Value("${gateway.pep3.url}")
    private String pepUrl;
    @Value("${gateway.zosconnect.url}")
    private String zosUrl;
    private EventLogsRepository eventLogsRepository;

    private String regStr = "\\r\\n";
    private String regStrSpace = "\\s+";
    private String spStr = " ";
    private static Gson gson = new GsonBuilder().disableInnerClassSerialization().disableHtmlEscaping().create();

    @LogExecutionTime
    public <T> T callZosConnectAPIService(Long eventID, String companyId, String keyIdentifierNumber, String url, String operatorId, String stubId, ZosFunctionRequest zosFunctionRequest, Class<T> zosOutputResponse, String serviceName) throws FidServiceException {
        HttpHeaders headers = buildHttpHeaderRequest(companyId);
        String endPoint = "";
        if (useBasicAuth) {
            headers.setBasicAuth(basicAuthLogin, basicAuthPasss);
            endPoint = zosUrl + url;
            LOGGER.debug("Basic Auth with endPoint:{}", endPoint);
        } else {
            try {
                headers.setBearerAuth(new JWTService(url, kid, iss, expSeconds, pkPath).generateJwtToken());
            } catch (Exception e) {
                LOGGER.info("GWT token generation exception {}", e.getMessage());
            }
            endPoint = pepUrl + url;
            LOGGER.debug("Bearer Auth with endPoint:{}", endPoint);
        }
        ZosRequestWrapper zosRequestWrapper = new ZosRequestWrapper();
        ZosRequest zosRequest = new ZosRequest();

        LOGGER.info("cis1358CustMaintenace zosFunctionRequest -> {}", zosFunctionRequest);
        zosRequest.setHeaderInput(getZosHeaderRequest(operatorId, stubId, CIS_CHANNEL_ID));
        zosRequest.setFunctionInput(zosFunctionRequest);
        zosRequestWrapper.setinput(zosRequest);
        HttpEntity<ZosRequestWrapper> requestBody = new HttpEntity<>(zosRequestWrapper, headers);
        ResponseEntity<ZosOutputResponseWrapper> result = null;
        String requestStr = null;
        objectMapper = new ObjectMapper();
        String vodsID = "";
        try {
            requestStr = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(zosRequestWrapper);
            LOGGER.info(serviceName + Constants.SPACE + " zosConnectService [MessageId={}, keyIdentifierNumber ={}, Endpoints={}, Header = {}]", headers.get(Constants.X_REQUEST_ID).toString(), keyIdentifierNumber, endPoint, headers);
            result = restTemplate.postForEntity(endPoint, requestBody, ZosOutputResponseWrapper.class, headers);
            vodsID = Optional.ofNullable(result).map(ResponseEntity::getBody).map(ZosOutputResponseWrapper::getOutput).map(ZosOutputResponse::getData).map(ZosDataResponse::getCorrelation).map(ZosCorrelation::getTraceID).orElse("");
            LOGGER.info(serviceName + Constants.SPACE + " Response-[keyIdentifierNumber ={}, Request ={}, ZosResponse={}, Vods-Trace-ID={}]", keyIdentifierNumber, requestStr.replaceAll(regStr,"").replaceAll(regStrSpace,spStr).trim(), gson.toJson(result).toString(), vodsID);
            if (result.getStatusCode() == HttpStatus.OK) {
                ZosOutputResponseWrapper e = result.getBody();
                if (Objects.nonNull(e) && Objects.nonNull(e.getOutput()) && Objects.nonNull(e.getOutput().getData()) && Objects.nonNull(e.getOutput().getData().getPayload())) {
                    // httpResponse.setHeader(Constants.X_VODS_TRACE_ID, e.getOutput().getData().getCorrelation().getTraceID());
                    saveLogs(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(e), keyIdentifierNumber, url, eventID, requestStr);
                    return objectMapper.convertValue(e.getOutput().getData().getPayload(), zosOutputResponse);
                }
            } else {
                ZosErrorException zosErrorException = new ZosErrorException(null, headers.get(Constants.X_REQUEST_ID).toString());
                zosErrorException.setCode(HttpStatus.BAD_GATEWAY.value());
                zosErrorException.setDetails(HttpStatus.BAD_GATEWAY.getReasonPhrase());
                saveLogs(zosErrorException.getDetails(), keyIdentifierNumber, url, eventID, requestStr);
                LOGGER.error("FID errors " + serviceName + Constants.SPACE + " [Request={}, Response={}]", requestStr.replaceAll(regStr,"").replaceAll(regStrSpace,spStr).trim(), zosErrorException.getDetails());
                throw zosErrorException;
            }

        } catch (RestClientResponseException exp) {
            if (exp.getRawStatusCode() == HttpStatus.BAD_REQUEST.value()) {
                try {
                    ZosOutputErrorWrapper zosOutputErrorWrapper = objectMapper.readValue(exp.getResponseBodyAsString(), ZosOutputErrorWrapper.class);
                    ZosErrorException zosErrorException = new ZosErrorException(exp, headers.get(Constants.X_REQUEST_ID).toString());
                    zosErrorException.setCode(zosOutputErrorWrapper.getOutput().getErrors().getReplyCode());
                    if (Objects.nonNull(zosOutputErrorWrapper.getOutput().getErrors())) {
                        zosErrorException.setDetails(Objects.nonNull(zosOutputErrorWrapper.getOutput().getErrors().getDetails()) ? zosOutputErrorWrapper.getOutput().getErrors().getDetails() : null);
                        zosErrorException.setErrorTable(Objects.nonNull(zosOutputErrorWrapper.getOutput().getErrors().getErrorTable()) ? zosOutputErrorWrapper.getOutput().getErrors().getErrorTable() : null);
                        vodsID = Optional.ofNullable(zosOutputErrorWrapper).map(ZosOutputErrorWrapper::getOutput).map(ZosOutputError::getData).map(ZosDataError::getCorrelation).map(ZosCorrelation::getTraceID).orElse("");
                    }
                    LOGGER.error("FID errors calling" + serviceName + Constants.SPACE + "[ MessageId={}, keyIdentifierNumber ={}, Request={}, Response={}, Vods-Trace-ID={}]", headers.get(Constants.X_REQUEST_ID).toString(), keyIdentifierNumber, objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(zosRequestWrapper).replaceAll(regStr,"").replaceAll(regStrSpace,spStr).trim(), objectMapper.writeValueAsString(zosOutputErrorWrapper).replaceAll(regStr,"").replaceAll(regStrSpace,spStr).trim(), vodsID);
                    saveLogs(objectMapper.writeValueAsString(zosOutputErrorWrapper), keyIdentifierNumber, url, eventID, requestStr);

                    throw zosErrorException;


                } catch (JsonProcessingException e) {
                    ZosErrorException zosErrorException = new ZosErrorException(exp, headers.get(Constants.X_REQUEST_ID).toString());
                    zosErrorException.setCode(HttpStatus.BAD_REQUEST.value());
                    //zosErrorException.setDetails(HttpStatus.BAD_GATEWAY.getReasonPhrase());
                    zosErrorException.setDetails(e.getMessage());
                    LOGGER.error(serviceName + Constants.SPACE + "FID errors JsonProcessingException [MessageId={}, keyIdentifierNumber ={}, Request ={}, Errors {}]", headers.get(Constants.X_REQUEST_ID).toString(), keyIdentifierNumber, requestStr.replaceAll(regStr,"").replaceAll(regStrSpace,spStr).trim(), e.getMessage());
                    saveLogs(zosErrorException.getDetails(), keyIdentifierNumber, url, eventID, requestStr);
                    throw zosErrorException;
                }
            } else if (exp.getRawStatusCode() == HttpStatus.INTERNAL_SERVER_ERROR.value() || exp.getRawStatusCode() == HttpStatus.BAD_GATEWAY.value() || exp.getRawStatusCode() == HttpStatus.SERVICE_UNAVAILABLE.value()) {
                ZosErrorException zosErrorException = new ZosErrorException(exp, headers.get(Constants.X_REQUEST_ID).toString());
                zosErrorException.setCode(exp.getRawStatusCode());
                zosErrorException.setDetails(exp.getStatusText());
                LOGGER.error(serviceName + Constants.SPACE + "FID error [MessageId={}, keyIdentifierNumber ={}, Request ={}, Errors ={}]", headers.get(Constants.X_REQUEST_ID).toString(), keyIdentifierNumber, requestStr.replaceAll(regStr,"").replaceAll(regStrSpace,spStr).trim(), exp.getMessage());
                // evenLogsImpl.saveEventlogs(zosErrorException.getDetails(), keyIdentifierNumber, eventID);
                saveLogs(exp.getStatusText(), keyIdentifierNumber, url, eventID, requestStr);
                throw zosErrorException;
            } else {
                LOGGER.error(serviceName + Constants.SPACE + "FID error FidServiceException [MessageId={}, keyIdentifierNumber ={}, Request ={}, Errors ={}]", headers.get(Constants.X_REQUEST_ID).toString(), keyIdentifierNumber, requestStr.replaceAll(regStr,"").replaceAll(regStrSpace,spStr).trim(), exp.getMessage());
                saveLogs(exp.getMessage(), keyIdentifierNumber, url, eventID, requestStr);
                throw new FidServiceException(exp, headers.get(Constants.X_REQUEST_ID).toString());
            }


        } catch (Exception exp) {
            LOGGER.error(serviceName + Constants.SPACE + "FID error [MessageId={}, keyIdentifierNumber = {}, Request ={}, Errors {}]", headers.get(Constants.X_REQUEST_ID), keyIdentifierNumber, requestStr.replaceAll(regStr,"").replaceAll(regStrSpace,spStr).trim(), exp.getMessage());
            saveLogs(exp.getMessage(), keyIdentifierNumber, url, eventID, requestStr);
            throw new FidServiceException(exp, headers.get(Constants.X_REQUEST_ID).toString());

        }
        return null;
    }

    private void saveLogs(String zosOutputErrorWrapper, String keyIdentifierNumber, String url, Long eventID, String requestBody) {
        if (url.equalsIgnoreCase(Constants.ENQUIRE_ENDPOINT) || url.equalsIgnoreCase(Constants.MAINTAIN_ENDPOINT)) {

            evenLogsImpl.saveEventlogs(zosOutputErrorWrapper, keyIdentifierNumber, eventID);

        } else if (url.equalsIgnoreCase(Constants.REG_ENQUIRE_ENDPOINT) || url.equalsIgnoreCase(Constants.REG_MAINTAIN_ENDPOINT)) {
            evenLogsImpl.saveReglogs(zosOutputErrorWrapper, keyIdentifierNumber, eventID, String.valueOf(requestBody));
        }

    }

    private ZosHeaderRequest getZosHeaderRequest(String operatorId, String stubId, String xOriginatingConsumerName) throws FidServiceException {
        ZosHeaderRequest zosHeaderRequest = new ZosHeaderRequest();
        zosHeaderRequest.setStubName(stubId);
        zosHeaderRequest.setOriginatingChannel(xOriginatingConsumerName);
        zosHeaderRequest.setBranch(branch);
        zosHeaderRequest.setTerminal(terminal);
        zosHeaderRequest.setOperatorID(Objects.nonNull(operatorId) ? operatorId.toUpperCase() : operatorId);

        return zosHeaderRequest;
    }

    private HttpHeaders buildHttpHeaderRequest(String companyId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        String uuid = UUID.randomUUID().toString();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set(Constants.X_REQUEST_ID, uuid);
        httpHeaders.set("X-Originating-Consumer-Username", CIS_CHANNEL_ID);
        httpHeaders.set("X-Consumer-Username", CIS_CHANNEL_ID);
        httpHeaders.set("Institution-ID", String.valueOf(companyId));

        return httpHeaders;
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Autowired
    public void setEventLogsRepository(EventLogsRepository eventLogsRepository) {
        this.eventLogsRepository = eventLogsRepository;
    }
}
