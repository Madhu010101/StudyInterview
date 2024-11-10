package za.co.fnb.cish.fid.monitoring.cleanup;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class CleanupService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CleanupService.class);

    private final ObjectMapper mapper;

    @Autowired
    DLQCleanupService dlqCleanupService;
    @Autowired
    EventLogCleanupService eventLogCleanupService;
    @Autowired
    RegulatoryLogCleanupService regulatoryLogCeanupService;
    @Value("${spring.profiles.active}")
    private String env;

    public CleanupService() {
        mapper = new ObjectMapper();
    }

    @Scheduled(cron = "#{@appProperties.getCleanupScheduler()}")
    public void cleanupForDLQs() {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            LOGGER.info("FID DLQ Cleanup Scheduler started : {} ", startTime);
            if(Objects.equals(env, "stress") || Objects.equals(env, "prod")) {
                if(dlqCleanupService !=null) {
                    LOGGER.info("FID DLQ Cleanup Scheduler started for R1 and R3 ");
                    dlqCleanupService.readAndDeleteDLQs();
                    dlqCleanupService.readAndDeleteDLQs2();
                } else{
                    LOGGER.error("There are no available DLQ's for clearing.");
                }
            } else{
                if(dlqCleanupService !=null){
                    LOGGER.info("FID DLQ Cleanup Scheduler started for 1 activeMQ instance ");
                    dlqCleanupService.readAndDeleteDLQs();
                } else{
                    LOGGER.error("There are no available DLQ's for clearing.");
                }
            }
            LocalDateTime endTime = LocalDateTime.now();
            LOGGER.info("FID DLQ Cleanup Scheduler finished : {} ", endTime);
        } catch (Exception e) {
            LOGGER.error("DLQ Cleanup Exception. ", e);
        }
    }

    @Scheduled(cron = "#{@appProperties.getCleanupScheduler()}")
    public void cleanupForEvents() {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            LOGGER.info("FID Events Cleanup Scheduler started : {} ", startTime);
            if(eventLogCleanupService != null) {
                eventLogCleanupService.readAndCleanupEvents();
            } else{
                LOGGER.error("No event logs available for cleanup.");
            }
            LocalDateTime endTime = LocalDateTime.now();
            LOGGER.info("FID Events Cleanup Scheduler finished : {} ", endTime);
        } catch (Exception e) {
            LOGGER.error("Event logs cleanup failed.", e);
        }
    }

    @Scheduled(cron = "#{@appProperties.getCleanupScheduler()}")
    public void cleanupForRegulatory() {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            LOGGER.info("FID Regulatory Cleanup Scheduler started : {} ", startTime);
            if(regulatoryLogCeanupService !=null){
                regulatoryLogCeanupService.readAndCleanupReg();
            } else{
                LOGGER.error("No regulatory logs available for cleanup.");
            }
            LocalDateTime endTime = LocalDateTime.now();
            LOGGER.info("FID Regulatory Cleanup Scheduler finished : {} ", endTime);
        } catch (Exception e) {
            LOGGER.error("Regulatory logs cleanup failed.", e);
        }
    }

    @Autowired
    public void setDlqCleanupService(DLQCleanupService dlqCleanupService) {
        this.dlqCleanupService = dlqCleanupService;
    }


    @Autowired
    public void setEventLogCleanupService(EventLogCleanupService eventLogCleanupService) {
        this.eventLogCleanupService = eventLogCleanupService;
    }

    @Autowired
    public void setRegulatoryLogCeanupService(RegulatoryLogCleanupService regulatoryLogCeanupService) {
        this.regulatoryLogCeanupService = regulatoryLogCeanupService;
    }
}
