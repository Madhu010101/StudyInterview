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
import za.co.fnb.cish.fid.common.api.cis1356.cis1356output.Cis1356rZosPayloadResponse;
import za.co.fnb.cish.fid.common.api.cis1359.cis1359output.Cis1359ZosPayloadResponse;
import za.co.fnb.cish.fid.common.api.exception.ZosErrorException;
import za.co.fnb.cish.fid.common.api.fidmaster.FirstIdMasterEntity;
import za.co.fnb.cish.fid.common.api.fidmaster.Identifier;
import za.co.fnb.cish.fid.repo.model.events.Event;
import za.co.fnb.cish.fid.repo.repository.events.EventRepository;
import za.co.fnb.cish.fid.zos.loader.service.impl.Cis1356RegEnquiryImpl;
import za.co.fnb.cish.fid.zos.loader.service.impl.Cis1359RegMaintenaceImpl;
import za.co.fnb.cish.fid.zos.loader.service.impl.EvenLogsImpl;
import za.co.fnb.cish.fid.zos.loader.util.ApplicationProperties;
import za.co.fnb.cish.fid.zos.loader.util.Constants;
import za.co.fnb.cish.fid.zos.loader.util.LogExecutionTime;
import za.co.fnb.cish.fid.zos.loader.zos.client.ZosServiceClient;

import java.util.*;
import java.util.stream.Collectors;

@Service
//("FidLoaderTask")
public class RegulatoryScheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegulatoryScheduler.class);
    private final ObjectMapper mapper;
    @Autowired
    ZosServiceClient zosServiceClient;
    Boolean stadnInFlag = Boolean.FALSE;
    @Autowired
    EvenLogsImpl evenLogsImpl;
    private EventRepository eventRepository;
    @Autowired
    private Cis1359RegMaintenaceImpl cis1359RegMaintenace;
    @Autowired
    private Cis1356RegEnquiryImpl cis1356RegEnquiry;
    private ApplicationProperties applicationProperties;

    public RegulatoryScheduler(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Scheduled(fixedRate = 20000)
    @Transactional()
    @LogExecutionTime
    public void getEvent() {
        List<Event> events = eventRepository.findBySatus(Boolean.FALSE, PageRequest.of(0, 50));

        FirstIdMasterEntity firstIdMasterEntity = null;
        String errorMessge = null;
        Integer count = 0;

        for (Event eve : events) {
            long serviveId = applicationProperties.getServiceID(Constants.REG_MAINTENANCE).getId();
            Map<Integer, Long> properties = applicationProperties.getproperty();
            List<Long> propServsList = applicationProperties.getFIdIds();
            List<String> eventServsList = (Objects.nonNull(eve.getService_ids()) && !eve.getService_ids().isEmpty()) ? Arrays.asList(eve.getService_ids().split(",")) : new ArrayList<>();
            List<Long> lsid = eventServsList.stream().map(Long::parseLong).collect(Collectors.toList());
            if (lsid.containsAll(propServsList)) {
                evenLogsImpl.updateEvent(eventServsList, eve, 0, propServsList);
                continue;
            } else if (eventServsList.contains(String.valueOf(serviveId))) {
                //evenLogsImpl.updateEvent(eventServsList, eve, 0, propServsList);
                continue;
            }
            count++;
            String fidMesg = eve.getTransformed_messages();
            Long evenID = eve.getId();
            stadnInFlag = Boolean.FALSE;
            int identifiretCounter = 0;
            try {
                firstIdMasterEntity = mapper.readValue(fidMesg, FirstIdMasterEntity.class);
                LOGGER.info("Start Regulatory FID -[ KeyIdentifierNumber={}]", firstIdMasterEntity.getKey().getKeyIdentifierNumber());
                LOGGER.debug("Regulatory FID Processing   FirstIdMasterEntity={}", firstIdMasterEntity.getParty());

                List<Identifier> identifier = firstIdMasterEntity.getParty().getIdentifiers().stream().filter(identifier1 -> identifier1.getIdentifierSystemEntpsTypeCode().equalsIgnoreCase("CIS")).collect(Collectors.toList());

                for (Identifier identfre : identifier) {
                    identifiretCounter++;
                    Long ucn = Long.valueOf(identfre.getIdentifierNumber());
                    LOGGER.info(" Start Regulatory Identifier [ KeyIdentifierNumber={}, UCN ={}]", firstIdMasterEntity.getKey().getKeyIdentifierNumber(), ucn);
                    Cis1356rZosPayloadResponse cis1356rZosPayloadResponse = zosServiceClient.callZosConnectAPIService(evenID, identfre.getJurisdictionCountryEntpsCode(), firstIdMasterEntity.getKey().getKeyIdentifierNumber(), Constants.REG_ENQUIRE_ENDPOINT, Constants.OPERATOR, Constants.STUBID, cis1356RegEnquiry.getCis1356RegEnquiry(firstIdMasterEntity, identfre.getJurisdictionCountryEntpsCode(), ucn), Cis1356rZosPayloadResponse.class, Constants.REG_INQUIRY);

                    Cis1359ZosPayloadResponse cis1359ZosPayloadResponse = zosServiceClient.callZosConnectAPIService(evenID, identfre.getJurisdictionCountryEntpsCode(), firstIdMasterEntity.getKey().getKeyIdentifierNumber(), Constants.REG_MAINTAIN_ENDPOINT, Constants.OPERATOR, Constants.STUBID, cis1359RegMaintenace.getCis1359fRegMaintnRequest(firstIdMasterEntity, cis1356rZosPayloadResponse, identfre.getJurisdictionCountryEntpsCode(), ucn), Cis1359ZosPayloadResponse.class, Constants.REG_MAINTENANCE);


                    if (Objects.nonNull(cis1359ZosPayloadResponse) && identifiretCounter == identifier.size()) {
                        evenLogsImpl.updateEvent(eventServsList, eve, serviveId, propServsList);
                    }


                    LOGGER.info("End Regulatory Identifier -[ KeyIdentifierNumber={},UCN = {}], ", firstIdMasterEntity.getKey().getKeyIdentifierNumber(), ucn);
                    LOGGER.debug("End Regulatory FID -[ MessageId={}, coreEnquiryFResponse={},CustomerMaintenanceResponse={}]", cis1356rZosPayloadResponse, Objects.nonNull(cis1359ZosPayloadResponse) ? cis1359ZosPayloadResponse : null);
                }
            } catch (ZosErrorException exp) {
                LOGGER.error("Regulatory FID Errors {},KeyIdentifierNumber= {}", exp.getMessage(), firstIdMasterEntity.getKey().getKeyIdentifierNumber());
                stadnInFlag = standinCheck(eve, exp.getCode(), (StringUtils.isNotEmpty(exp.getMessage())
                ) ? exp.getMessage() : "");

            } catch (Exception exp) {
                // errorMessge = exp.getMessage();
                if (exp instanceof NumberFormatException) {
                    errorMessge = exp.toString();
                } else if (Objects.nonNull(errorMessge)) {
                    errorMessge = errorMessge.length() > 200 ? errorMessge.substring(0, 200) : exp.toString();
                }
                evenLogsImpl.saveReglogs(errorMessge, (Objects.nonNull(firstIdMasterEntity) && Objects.nonNull(firstIdMasterEntity.getKey()) && Objects.nonNull(firstIdMasterEntity.getKey().getKeyIdentifierNumber())) ? firstIdMasterEntity.getKey().getKeyIdentifierNumber() : null, eve.getId(), fidMesg);
                LOGGER.error("Regulatory FID ZOS service Errors = {} ", exp);

            } finally {
                if (stadnInFlag) {
                    break;
                } else {
                    evenLogsImpl.updateEvent(eventServsList, eve, serviveId, propServsList);
                }
                LOGGER.info("End Regulatory FID -[ KeyIdentifierNumber={}]", firstIdMasterEntity.getKey().getKeyIdentifierNumber());
            }
        }
        LOGGER.info("Regulatory service getEvent -[ record processed={}], ", count);

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
                    notifyAll();
                    LOGGER.error("Regulatory InterruptedException={}", Ie.getMessage());
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