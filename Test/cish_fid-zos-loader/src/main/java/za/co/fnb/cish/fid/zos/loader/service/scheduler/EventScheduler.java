package za.co.fnb.cish.fid.zos.loader.service.scheduler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.fnb.cish.fid.common.api.cis1358.cis1358output.Cis1358ZosPayloadResponse;
import za.co.fnb.cish.fid.common.api.cis1362.cis1362input.Cis1362rZosPayloadResponse;
import za.co.fnb.cish.fid.common.api.cis1362.cis1362output.CoreEnquiryResponse;
import za.co.fnb.cish.fid.common.api.cis1362.cis1362output.CoreEnquiryResponseWrapper;
import za.co.fnb.cish.fid.common.api.exception.ZosErrorException;
import za.co.fnb.cish.fid.common.api.fidmaster.FirstIdMasterEntity;
import za.co.fnb.cish.fid.common.api.fidmaster.Identifier;
import za.co.fnb.cish.fid.repo.model.events.Event;
import za.co.fnb.cish.fid.repo.repository.events.EventRepository;
import za.co.fnb.cish.fid.zos.loader.service.impl.Cis1358CustMaintenaceImpl;
import za.co.fnb.cish.fid.zos.loader.service.impl.Cis1362CustEnquiryImpl;
import za.co.fnb.cish.fid.zos.loader.service.impl.EvenLogsImpl;
import za.co.fnb.cish.fid.zos.loader.util.ApplicationProperties;
import za.co.fnb.cish.fid.zos.loader.util.Constants;
import za.co.fnb.cish.fid.zos.loader.util.LogExecutionTime;
import za.co.fnb.cish.fid.zos.loader.zos.client.ZosServiceClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
//("FidLoaderTask")
public class EventScheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventScheduler.class);
    private final ObjectMapper mapper;
    @Autowired
    ZosServiceClient zosServiceClient;
    Boolean stadnInFlag = Boolean.FALSE;
    @Autowired
    EvenLogsImpl evenLogsImpl;
    @Autowired
    EvenLogsImpl regEventLogs;
    private EventRepository eventRepository;
    @Autowired
    private Cis1358CustMaintenaceImpl cis1358CustMaintenace;
    @Autowired
    private Cis1362CustEnquiryImpl cis1362CustEnquiry;
    private ApplicationProperties applicationProperties;


    public EventScheduler(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Scheduled(fixedRate = 20000)
    @Transactional()
    @LogExecutionTime
    public void getEvent() {
        List<Event> event = eventRepository.findBySatus(Boolean.FALSE, PageRequest.of(0, 50));
        FirstIdMasterEntity firstIdMasterEntity = null;
        String errorMessge = null;
        Integer count = 0;
        // LOGGER.info("Start thread FIDIProccessing ThreadActive count :{} ,Thread name:{}", Thread.currentThread().getName(), Thread.currentThread().getId());
        for (Event eve : event) {
            count++;
            String fidMesg = eve.getTransformed_messages();
            Long evenID = eve.getId();
            stadnInFlag = Boolean.FALSE;
            long serviveId = applicationProperties.getServiceID(Constants.CORE_MAINTENANCE).getId();
            List<Long> propServsList = applicationProperties.getFIdIds();
            List<String> eventServsList = (Objects.nonNull(eve.getService_ids()) && !eve.getService_ids().isEmpty()) ? Arrays.asList(eve.getService_ids().split(",")) : new ArrayList<>();
            List<Long> lsid = eventServsList.stream().map(Long::parseLong).collect(Collectors.toList());

            if (lsid.containsAll(propServsList)) {
                regEventLogs.updateEvent(eventServsList, eve, 0, propServsList);
                continue;
            } else if (eventServsList.contains(String.valueOf(serviveId))) {
                continue;
            }
            int identifiretCounter = 0;
            try {
                firstIdMasterEntity = mapper.readValue(fidMesg, FirstIdMasterEntity.class);
                LOGGER.info("Start Core FID -[ KeyIdentifierNumber={}]", firstIdMasterEntity.getKey().getKeyIdentifierNumber());
                LOGGER.debug("Core FirstIdMasterEntity={}", firstIdMasterEntity.getParty());

                List<Identifier> identifier = firstIdMasterEntity.getParty().getIdentifiers().stream().filter(identifier1 -> identifier1.getIdentifierSystemEntpsTypeCode().equalsIgnoreCase("CIS")).collect(Collectors.toList());

                for (Identifier identfre : identifier) {
                    identifiretCounter++;
                    Long ucn = Long.valueOf(identfre.getIdentifierNumber());
                    LOGGER.info(" Start Core Identifier [ KeyIdentifierNumber={}, UCN ={}]", firstIdMasterEntity.getKey().getKeyIdentifierNumber(), ucn);
                    Cis1362rZosPayloadResponse cis1362rZosPayloadResponse = zosServiceClient.callZosConnectAPIService(evenID, identfre.getJurisdictionCountryEntpsCode(), firstIdMasterEntity.getKey().getKeyIdentifierNumber(), Constants.ENQUIRE_ENDPOINT, Constants.OPERATOR, Constants.STUBID, cis1362CustEnquiry.getCis1362fZosFunctionRequest(firstIdMasterEntity, identfre.getJurisdictionCountryEntpsCode(), ucn), Cis1362rZosPayloadResponse.class, Constants.CORE_INQUIRY);

                    CoreEnquiryResponse coreEnquireResponse = null;
                    CoreEnquiryResponseWrapper coreEnquireResponseWrapper = null;
                    if (Objects.nonNull(cis1362rZosPayloadResponse)) {
                        coreEnquireResponseWrapper = new CoreEnquiryResponseWrapper();
                        coreEnquireResponse = cis1362CustEnquiry.buildCoreEnquireResponse(cis1362rZosPayloadResponse);
                        coreEnquireResponseWrapper.setData(coreEnquireResponse);
                    }

                    Cis1358ZosPayloadResponse cis1358ZosPayloadResponse = zosServiceClient.callZosConnectAPIService(evenID, identfre.getJurisdictionCountryEntpsCode(), firstIdMasterEntity.getKey().getKeyIdentifierNumber(), Constants.MAINTAIN_ENDPOINT, Constants.OPERATOR, Constants.STUBID, cis1358CustMaintenace.getCis1358fZosFunctionRequest(firstIdMasterEntity, coreEnquireResponseWrapper, identfre.getJurisdictionCountryEntpsCode(), ucn), Cis1358ZosPayloadResponse.class, Constants.CORE_MAINTENANCE);
                    if (Objects.nonNull(cis1358ZosPayloadResponse) && identifiretCounter == identifier.size()) {
                        regEventLogs.updateEvent(eventServsList, eve, serviveId, propServsList);
                    }

                    LOGGER.info("End Core Identifier -[ KeyIdentifierNumber={},UCN = {}], ", firstIdMasterEntity.getKey().getKeyIdentifierNumber(), ucn);
                    LOGGER.debug("End Core FID -[ MessageId={}, CoreResponse={},CoreResponse={}]", coreEnquireResponse, Objects.nonNull(cis1358ZosPayloadResponse) ? cis1358ZosPayloadResponse : null);
                }
            } catch (ZosErrorException exp) {
                LOGGER.error("Core FID Errors {},KeyIdentifierNumber= {}", exp.getMessage(), firstIdMasterEntity.getKey().getKeyIdentifierNumber());
                stadnInFlag = standinCheck(eve, exp.getCode(), (StringUtils.isNotEmpty(exp.getMessage())
                ) ? exp.getMessage() : "");

            } catch (Exception exp) {
                errorMessge = exp.getMessage();
                if (exp instanceof NumberFormatException) {
                    errorMessge = exp.getMessage();
                } else if (Objects.nonNull(errorMessge)) {
                    errorMessge = errorMessge.length() > 200 ? errorMessge.substring(0, 200) : exp.getMessage();
                    //  errorMessge = errorMessge.substring(0, 200);
                }
                evenLogsImpl.saveEventlogs(errorMessge, (Objects.nonNull(firstIdMasterEntity) && Objects.nonNull(firstIdMasterEntity.getKey()) && Objects.nonNull(firstIdMasterEntity.getKey().getKeyIdentifierNumber())) ? firstIdMasterEntity.getKey().getKeyIdentifierNumber() : null, eve.getId());
                LOGGER.error("Core ZOS service Errors = {} ", exp);

            } finally {
                if (stadnInFlag) {
                    break;
                } else {
                    regEventLogs.updateEvent(eventServsList, eve, serviveId, propServsList);
                }
                LOGGER.info("End Core FID -[ KeyIdentifierNumber={}]", firstIdMasterEntity.getKey().getKeyIdentifierNumber());
            }
        }
        LOGGER.info("End Core services getEvent -[ record proccesed={}], ", count);

    }

    public Boolean standinCheck(Event eve, Integer code, String message) {
        Boolean flag = Boolean.FALSE;

        if (StringUtils.isNotEmpty(message) && Objects.nonNull(code)) {
            if (Constants.STANDIN_ERROR.contains(code) || message.contains("FUNCTION CURRENTLY NOT SUPPORTED")) {
                flag = Boolean.TRUE;
                try {
                    if (flag) {
                        Thread.sleep(Constants.STANDIN_DELAY);
                    }
                } catch (InterruptedException Ie) {
                    notify();
                    LOGGER.error("Core Maintenance InterruptedException={}", Ie.getMessage());
                }
            }
        }
        return flag;
    }

    @Autowired
    public void setEventRepository(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Autowired
    public void setApplicationProperties(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }
}