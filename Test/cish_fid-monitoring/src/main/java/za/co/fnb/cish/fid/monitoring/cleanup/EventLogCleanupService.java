package za.co.fnb.cish.fid.monitoring.cleanup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import za.co.fnb.cish.fid.monitoring.util.AppProperties;
import za.co.fnb.cish.fid.repo.model.events.EventLogs;
import za.co.fnb.cish.fid.repo.repository.events.EventLogsRepository;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

@Service
public class EventLogCleanupService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventLogCleanupService.class);

    private EventLogsRepository eventLogsRepository;

    @Autowired
    public void setEventLogsRepository(EventLogsRepository eventLogsRepository){
        this.eventLogsRepository = eventLogsRepository;
    }
    @Autowired
    private AppProperties appProperties;

    public void readAndCleanupEvents() {

        try {
            int batchSize = 1000;
            Timestamp dbCuttOffTimestamp = Timestamp.valueOf(LocalDate.now().minusDays(Long.parseLong(appProperties.getDbCleanUpDays())).atStartOfDay());
            boolean isTrue = true;

            while (isTrue) {

                Page<EventLogs> eventLogsPage = eventLogsRepository.findByStatusAndDate(dbCuttOffTimestamp, Boolean.TRUE, PageRequest.of(0, batchSize));

                if (!eventLogsPage.hasContent()) {
                    isTrue = false;
                    break;
                }

                if(isTrue){

                    List<EventLogs> eventLogsList = eventLogsPage.getContent();
                    eventLogsRepository.deleteAllInBatch(eventLogsList);
                }

            }

        }catch(Exception e){
            LOGGER.error("Exception : ", e);

        }

    }
}
