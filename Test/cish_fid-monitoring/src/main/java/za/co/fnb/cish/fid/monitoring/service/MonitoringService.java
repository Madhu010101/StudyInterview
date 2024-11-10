package za.co.fnb.cish.fid.monitoring.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import za.co.fnb.cish.fid.monitoring.email.EmailClient;
import za.co.fnb.cish.fid.monitoring.util.FileManager;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


@Service
public class MonitoringService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MonitoringService.class);

    private final ObjectMapper mapper;
    @Autowired
    public FileManager fileManager;
    @Autowired(required = true)
    private EmailClient mailSender;
    @Value("${spring.activemq.user}")
    private String activemqusername;
    @Value("${spring.activemq.password}")
    private String activemqpassword;
    @Value("#{'${dlq.email.recipients}'.split(',')}")
    private String[] recipients;
    @Value("${dlq.email.sender}")
    private String sender;
    @Value("${spring.profiles.active}")
    private String env;
    @Autowired
    public MessageReceiverService messageReceiverService;
    @Autowired
    private RegulatoryReceiverService regulatoryReceiverService;
    @Autowired
    private EventRecieverService eventRecieverService;

    private static final String EMAIL_SUBJECT_FID_MNTR = " DLQ FID Monitoring Report ";
    private static final String EMAIL_SUBJECT_REG_FID_MNTR = " Regulatory FID Monitoring Report ";
    private static final String EMAIL_SUBJECT_EVENT_FID_MNTR = " Event logs FID Monitoring Report ";
    private static final String EMAIL_MESSAGE = "Good Day,\n" +
            "\n" +
            "Please find the attached report.\n" +
            "\n" +
            "Regards";
    public String yyyMMdd = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyMMdd"));

    public MonitoringService() {
        mapper = new ObjectMapper();
    }

    @Scheduled(cron = "#{@appProperties.getDlqScheduler()}")
    public void reportForDLQs() {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            LOGGER.info("FID DLQ Scheduler started : {} ", startTime);
            File attachmentFile = messageReceiverService.readDlqMesg();
            if(attachmentFile!=null){
                mailSender.sendEmail(sender, recipients, yyyMMdd + EMAIL_SUBJECT_FID_MNTR + env,EMAIL_MESSAGE , attachmentFile);
            }
            if(Objects.equals(env, "stress") || Objects.equals(env, "prod")) {
                File attachmentFile2 = messageReceiverService.readDlqMesg2();
                if (attachmentFile2 != null) {
                    mailSender.sendEmail(sender, recipients, yyyMMdd + EMAIL_SUBJECT_FID_MNTR + env, EMAIL_MESSAGE, attachmentFile2);
                }
            }
            LocalDateTime endTime = LocalDateTime.now();
            LOGGER.info("FID DLQ Scheduler finished : {} ", endTime);
        } catch (Exception e) {
            LOGGER.error("Exception", e);
        }
    }

    @Scheduled(cron = "#{@appProperties.getRegScheduler()}")
    public void reportForRegulatoryMntr() {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            LOGGER.info("regulatory scheduler started : {} ", startTime);
            File attachmentfile = regulatoryReceiverService.readRegulatoryMesg();
            LOGGER.info("attachment file" + attachmentfile);
            if(attachmentfile!=null){
                mailSender.sendEmail(sender, recipients, yyyMMdd + EMAIL_SUBJECT_REG_FID_MNTR + env, EMAIL_MESSAGE, attachmentfile);
            }
            LocalDateTime endTime = LocalDateTime.now();
            LOGGER.info("regulatory scheduler finished : {} ", endTime);
        } catch (Exception e) {
            LOGGER.error("Exception : ", e);
        }
    }


    @Scheduled(cron = "#{@appProperties.getEventScheduler()}")
    private void eventsScheduler() {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            LOGGER.info("Event scheduler started : {} ", startTime);
            File eventAttachmentfile = eventRecieverService.readEvents();
            LOGGER.info("EVENTS HAVE BEEN READ");
            if(eventAttachmentfile!=null){
                mailSender.sendEmail(sender, recipients, yyyMMdd + EMAIL_SUBJECT_EVENT_FID_MNTR + env, EMAIL_MESSAGE, eventAttachmentfile);
            }
            LocalDateTime endTime = LocalDateTime.now();
            LOGGER.info("Event scheduler finished : {} ", endTime);
        } catch (Exception e) {
            LOGGER.error("Exception : ", e);
        }
    }
}
