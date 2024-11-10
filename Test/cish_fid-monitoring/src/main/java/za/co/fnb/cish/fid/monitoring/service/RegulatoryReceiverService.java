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
import za.co.fnb.cish.fid.repo.model.events.RegulatoryLogs;
import za.co.fnb.cish.fid.repo.repository.events.RegulatoryRepository;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class RegulatoryReceiverService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RegulatoryReceiverService.class);

    List<CSVItem> csvItem = new ArrayList<>();

    @Autowired
    private FileManager fileManager;
    private RegulatoryRepository regulatoryRepository;

    @Autowired
    public void setRegulatoryRepository(RegulatoryRepository regulatoryRepository) {
        this.regulatoryRepository = regulatoryRepository;
    }


    public File readRegulatoryMesg() {
        File file = null;
        String yyyMMdd = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyMMdd"));
        String fileNameString = Constants.REGU_FILENAME + yyyMMdd + Constants.FILEEXTENSION;
        csvItem.clear();

        try {
            int batchSize = 30000;
            List<Long> batchIds = new ArrayList<>();
            boolean isTrue = true;


            while (isTrue) {
                Page<RegulatoryLogs> regulatoryLogsPage = regulatoryRepository.findByStatus(Boolean.FALSE, PageRequest.of(0, batchSize));

                if (!regulatoryLogsPage.hasContent()) {
                    isTrue = false;
                    break;
                }

                List<RegulatoryLogs> regLogsList = regulatoryLogsPage.getContent();
                batchIds.clear();


                for (RegulatoryLogs regLogs : regLogsList) {

                    batchIds.add(regLogs.getId());

                    if (batchIds.size() >= batchSize) {
                        processBatchUpdate(batchIds);
                        batchIds.clear();
                    }
                }

                if (!batchIds.isEmpty()) {
                    processBatchUpdate(batchIds);
                }

                addDataToCsvItem(regLogsList);

                List<Long> longList = regLogsList.stream().map(RegulatoryLogs::getId).collect(Collectors.toList());
                regulatoryRepository.updateStatusForIds(Boolean.TRUE, longList);

                if (Objects.nonNull(csvItem) && !csvItem.isEmpty()) {
                    file = fileManager.csvGeneratorForDB(csvItem, fileNameString, "DB");
                }
            }
            return file;
        } catch(Exception e){
            LOGGER.error("Exception : ", e);
        }
        return null;
    }

    private void processBatchUpdate(List<Long> batchIds) {
        int updatedCount = regulatoryRepository.updateStatusForIds(Boolean.TRUE, batchIds);
        LOGGER.info("Count of regulators updated " + updatedCount);
    }

    private CSVItem setDataCsv(RegulatoryLogs rl) {
        CSVItem csvfile = new CSVItem();
        csvfile.setKeyIdentifierNum(rl.getKeyIdentifierNumber());
        csvfile.setErrorDesc(rl.getResponse());
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

    private void addDataToCsvItem(List<RegulatoryLogs> regulatoryLogsList){
        int count = 0;
        List<Long> regLogsId = null;
        if(Objects.nonNull(regulatoryLogsList) && !regulatoryLogsList.isEmpty() ){
            long regulatoryLogsListSize = regulatoryLogsList.size();
            if (regulatoryLogsListSize > 0) {
                for (RegulatoryLogs rl: regulatoryLogsList) {
                    count = count + 1;
                    if (count <= regulatoryLogsListSize) {
                        csvItem.add(setDataCsv(rl));
                    }
                }
            }
        }
    }

}
