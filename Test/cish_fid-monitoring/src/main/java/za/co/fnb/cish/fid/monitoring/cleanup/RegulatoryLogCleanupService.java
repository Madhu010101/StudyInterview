package za.co.fnb.cish.fid.monitoring.cleanup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import za.co.fnb.cish.fid.monitoring.util.AppProperties;
import za.co.fnb.cish.fid.repo.model.events.RegulatoryLogs;
import za.co.fnb.cish.fid.repo.repository.events.RegulatoryRepository;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

@Service
public class RegulatoryLogCleanupService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RegulatoryLogCleanupService.class);

    private RegulatoryRepository regulatoryRepository;

    @Autowired
    public void setRegulatoryRepository(RegulatoryRepository regulatoryRepository) {
        this.regulatoryRepository = regulatoryRepository;
    }
    @Autowired
    private AppProperties appProperties;

    public void readAndCleanupReg() {

        try {
            int batchSize = 1000;
            boolean isTrue = true;
            Timestamp dbCuttOffTimestamp = Timestamp.valueOf(LocalDate.now().minusDays(Long.parseLong(appProperties.getDbCleanUpDays())).atStartOfDay());

            while (isTrue) {
                Page<RegulatoryLogs> regulatoryLogsPage = regulatoryRepository.findByStatusAndDate(dbCuttOffTimestamp, Boolean.TRUE, PageRequest.of(0, batchSize));

                if (!regulatoryLogsPage.hasContent()) {
                    isTrue = false;
                    break;
                }

                if(isTrue){

                    List<RegulatoryLogs> regLogsList = regulatoryLogsPage.getContent();
                    regulatoryRepository.deleteAllInBatch(regLogsList);
                }
            }

        } catch(Exception e){
            LOGGER.error("Exception : ", e);
        }
    }
}
