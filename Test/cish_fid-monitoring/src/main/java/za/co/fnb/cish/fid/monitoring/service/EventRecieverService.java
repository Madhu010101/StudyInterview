package za.co.fnb.cish.fid.monitoring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import za.co.fnb.cish.fid.monitoring.util.CSVItem;
import za.co.fnb.cish.fid.monitoring.util.Constants;
import za.co.fnb.cish.fid.monitoring.util.FileManager;
import za.co.fnb.cish.fid.repo.model.events.EventLogs;
import za.co.fnb.cish.fid.repo.repository.events.EventLogsRepository;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Service
public class EventRecieverService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventRecieverService.class);

    List<CSVItem> csvItem = new ArrayList<>();

    @Autowired
    private FileManager fileManager;
    private EventLogsRepository eventLogsRepository;

    @Autowired
    public void setEventLogsRepository(EventLogsRepository eventLogsRepository){
        this.eventLogsRepository = eventLogsRepository;
    }

    public File readEvents() {
        File file = null;
        String yyyMMdd = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyMMdd"));
        String fileNameString =  Constants.EVENT_FILENAME + yyyMMdd + Constants.FILEEXTENSION;
        csvItem.clear();

        try {

            int batchSize = 30000;
            List<Long> batchIds = new ArrayList<>();
            boolean isTrue = true;



            while (isTrue) {

                Page<EventLogs> eventLogsPage = eventLogsRepository.findByStatus(Boolean.FALSE, PageRequest.of(0, batchSize));

                if (!eventLogsPage.hasContent()) {
                    isTrue = false;
                    break;
                }

                List<EventLogs> eventLogsList = eventLogsPage.getContent();
                batchIds.clear();


                for (EventLogs eventLogs : eventLogsList) {

                    batchIds.add(eventLogs.getId());

                    if (batchIds.size() >= batchSize) {
                        processBatchUpdate(batchIds);
                        batchIds.clear();
                    }
                }

                if (!batchIds.isEmpty()) {
                    processBatchUpdate(batchIds);
                }

                addDataToCsvItem(eventLogsList);

                List<Long> longList = eventLogsList.stream().map(EventLogs::getId).collect(Collectors.toList());
                eventLogsRepository.updateStatus(Boolean.TRUE, longList);

                if (Objects.nonNull(csvItem) && !csvItem.isEmpty()) {
                    file = fileManager.csvGeneratorForDB(csvItem, fileNameString, "DB");
                }
            }
            return file;
        }catch(Exception e){
            LOGGER.error("Exception : ", e);
        }
        return null;
    }

    private void processBatchUpdate(List<Long> batchIds) {
        int updatedCount = eventLogsRepository.updateStatus(Boolean.TRUE, batchIds);
        LOGGER.info("Count of events updated " + updatedCount);
    }

    private CSVItem setDataCsv(EventLogs rl) {
        CSVItem csvfile = new CSVItem();
        csvfile.setKeyIdentifierNum(rl.getKeyIdentifierNumber());
        csvfile.setErrorDesc(rl.getError_description());
        csvfile.setDate(getStrDate(rl.getDate()));
        csvfile.setEventId(rl.getEvent_id());
        return csvfile;
    }

    private String getStrDate(Timestamp tdate) {
        String sdate = "";
        if(Objects.nonNull(tdate)){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm");
            sdate = formatter.format(tdate);
        }
        return sdate;
    }

    private void addDataToCsvItem(List<EventLogs> eventLogsList){
        int count = 0;
        if(Objects.nonNull(eventLogsList) && !eventLogsList.isEmpty() ){
            long eventLogsListSize = eventLogsList.size();
            if (eventLogsListSize > 0) {
                for (EventLogs rl: eventLogsList) {
                    count = count + 1;
                    if (count <= eventLogsListSize) {
                        csvItem.add(setDataCsv(rl));
                    }
                }
            }
        }
    }
}