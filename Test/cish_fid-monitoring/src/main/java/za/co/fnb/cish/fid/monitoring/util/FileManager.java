package za.co.fnb.cish.fid.monitoring.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@DependsOn("Constants")
public class FileManager {
    @Autowired
    Constants constants;
    private static final CSVFormat FORMAT = CSVFormat.DEFAULT.withHeader(Constants.DLQ_HEADERS);
    private static final Logger LOGGER = LoggerFactory.getLogger(FileManager.class);
    BufferedWriter output = null;
    public long fileLength = 0;

    public static void createDirIfNotExist(String path) {

        File mftFileDirStrExist = new File(path);
        if (!mftFileDirStrExist.exists()) {
            mftFileDirStrExist.mkdirs();
        }
    }

    public static boolean deleteFile(String fileName) {
        File fileToDelete = new File(fileName);
        return fileToDelete.exists() && fileToDelete.delete();
    }

    public void writeRecord(String record) throws IOException {
        this.output.write(record);
    }

    public void closeFile() throws IOException {
        this.output.flush();
        this.output.close();
    }

    public File csvGenerator(List<CSVItem> csvItem) throws IOException {

        long start = System.currentTimeMillis();
        LOGGER.info("Writing data to the csv printer");
        final Set errorMeg = new HashSet<String>();
        final List errorMeg1 = new ArrayList();
        String yyyMMdd = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyMMdd"));
        String fileNameString =  Constants.FILENAME + yyyMMdd + Constants.FILEEXTENSION;

        File file = new File(constants.incoming  + File.separator + fileNameString);
        if (!(new File(constants.incoming + File.separator + fileNameString).isFile())) {
            FileManager.createDirIfNotExist(constants.incoming);
        }

        try (FileWriter fileWriter = new FileWriter(file);
             CSVPrinter printer = new CSVPrinter(new BufferedWriter(fileWriter), CSVFormat.DEFAULT.withHeader(Constants.DLQ_HEADERS))) {


            csvItem.stream().forEach(csvItem1 -> errorMeg1.add(csvItem1.getQueueName() + "_" + csvItem1.getError()));
            Map<String, Long> counter = (Map<String, Long>) errorMeg1.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            //LOGGER.debug("List errorMeg1:{}, counter :{}", errorMeg1, counter);
            for (CSVItem csvFile : csvItem) {
                printer.printRecord(csvFile.getQueueName(),csvFile.getError(),csvFile.getMessage());
            }
            printer.flush();
            LOGGER.info("Execution time " + start);
            return file;
        }
    }

    public File csvGeneratorForDB(List<CSVItem> csvItem, String fileName, String type) throws IOException {
        long start = System.currentTimeMillis();
        LOGGER.info("Writing data to the csv printer");

        File file = new File(constants.incoming  + File.separator + fileName);
        if (!(new File(constants.incoming + File.separator + fileName).isFile())) {
            FileManager.createDirIfNotExist(constants.incoming);
            FileManager.createDirIfNotExist(constants.done);
        }
        String[] headerVal = "DB".equals(type) ? Constants.DB_HEADERS : Constants.DLQ_HEADERS;
        try (FileWriter fileWriter = new FileWriter(file);
             CSVPrinter printer = new CSVPrinter(new BufferedWriter(fileWriter), CSVFormat.DEFAULT.withHeader(headerVal))) {
            if("DB".equals(type)){
                for (CSVItem csvFile : csvItem) {
                    printer.printRecord(csvFile.getEventId(),csvFile.getKeyIdentifierNum(),csvFile.getErrorDesc(),csvFile.getDate());
                }
            }else{
                for (CSVItem csvFile : csvItem) {
                    printer.printRecord(csvFile.getQueueName(),csvFile.getError(),csvFile.getMessage(),csvFile.getDate());
                }
            }
            printer.flush();
            LOGGER.info("Execution time : {} " , start);
            fileLength = file.length();
            return file;
        }catch (Exception e) {
            LOGGER.error("Exception ", e);
            return null;
        }
    }
}