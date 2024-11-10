package za.co.fnb.cish.fid.monitoring.util;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.repo.model.events.SchedulerConfig;
import za.co.fnb.cish.fid.repo.repository.events.SchedulerConfigRepository;

import java.util.List;
import java.util.Properties;


@Component
public class AppProperties {

    @Autowired
    private SchedulerConfigRepository schedulerConfigRepository;

    private final Properties propertiesMap = new Properties();

    public String dlqScheduler;
    public String eventScheduler;
    public String regScheduler;
    public String cleanupScheduler;
    public String dbCleanUpDays;
    public String dlqCleanUpDays;

    @PostConstruct
    private void initialize() {

        List<SchedulerConfig> appProps = schedulerConfigRepository.findAll();
        for (SchedulerConfig config : appProps) {
            propertiesMap.setProperty(config.getScheduler_name(), config.getScheduler_value());
        }

        dlqScheduler = propertiesMap.getProperty("dlqScheduler");
        eventScheduler = propertiesMap.getProperty("eventScheduler");
        regScheduler = propertiesMap.getProperty("regScheduler");
        cleanupScheduler = propertiesMap.getProperty("cleanupScheduler");
        dbCleanUpDays = propertiesMap.getProperty("dbCleanUpDays");
        dlqCleanUpDays = propertiesMap.getProperty("dlqCleanUpDays");
    }
    public String getDlqScheduler() {
        return dlqScheduler;
    }

    public String getEventScheduler() {
        return eventScheduler;
    }

    public String getRegScheduler() {
        return regScheduler;
    }

    public String getDbCleanUpDays() {
        return dbCleanUpDays;
    }

    public String getDlqCleanUpDays() {
        return dlqCleanUpDays;
    }
    public String getCleanupScheduler() {
        return cleanupScheduler;
    }
}
