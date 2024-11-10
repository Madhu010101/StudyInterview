package za.co.fnb.cish.fid.monitoring.util;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component("Constants")
public class Constants {
    public static final String FILEEXTENSION = ".csv";

    public static final String FILENAME = "FID_DLQMonitoring_";
    public static final String REGU_FILENAME = "RegMonitoring_" ;
    public static final String EVENT_FILENAME = "EventMonitoring_";
    public static final String[] DLQ_HEADERS = {"Queue", "Error","Message", "Date"};
    public static final String[] DB_HEADERS = {"id","keyidentifiernumber", "error_description","date"};
    public static final String DELETE_7_DAY_OLD_FILE = "Deleting 7 day old file.";
    public static final String START_DELETE_7_DAY_OLD_FILE ="Start deleting 7 day old file.";
    public static final String SEND_FAILURE = "Error while trying to send email.";
    public static final String DELETE_FAILURE = "Error while trying to delete file.";
    public static final String ACTIVEMQ_ERROR = "Error while consuming from active MQ";
    public static final String YYY_M_MDD = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyMMdd"));
    public static final long JMS_TIMEOUT = 1000;
    public static final Integer DAY = 24 * 60 * 60 * 1000;

    @Value("${spring.profiles.active}")
    public String environment;
    @Value("${dlq.file.incoming}")
    public String incoming;
    @Value("${dlq.file.done}")
    public String done;

    @PostConstruct
    private void init() {
        if ("local-dev".equals(environment)) {
            String workingDir = System.getProperty("user.dir");
            incoming = workingDir + incoming;
            done = workingDir + done;
        }
    }

}
