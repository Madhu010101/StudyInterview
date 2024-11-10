package za.co.fnb.cish.fid.monitoring.email;

import jakarta.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.monitoring.util.Constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static za.co.fnb.cish.fid.monitoring.util.Constants.*;

@Component
@DependsOn("Constants")
public class EmailClient {


    public static final Logger LOGGER = LoggerFactory.getLogger(EmailClient.class);

    private JavaMailSender emailSender;
    @Autowired
    private Constants constants;

    @Value("${dlq.email.sender}")
    private String attachsender;
    @Value("${spring.profiles.active}")
    public String environment;
    @Value("${dlq.file.incoming}")
    public String incoming;
    @Value("${dlq.file.done}")
    public String done;

    public void setMailSender(JavaMailSender mailSender) {
        this.emailSender = mailSender;
    }

    public void sendEmail(String sender, String[] recipients, String subject, String messageText, File attachFile) throws IOException {

        boolean mailStatus=true;
        try {
            LOGGER.info("Start Sending email");
            if (Objects.nonNull(attachFile) && (attachFile.isFile())) {

                File zipFile = File.createTempFile(YYY_M_MDD + " Report", ".zip");
                FileOutputStream fileOutputStream = new FileOutputStream(zipFile);
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);

                addToZipFile(attachFile, zipOutputStream);
                zipOutputStream.close();

                MimeMessage message = emailSender.createMimeMessage();
                MimeMessageHelper helper = new MimeMessageHelper(message, true);
                helper.setFrom(sender);
                helper.setTo(recipients);
                helper.setSubject(subject);
                helper.setText(messageText);

                LOGGER.info("Attaching zip file to the email");
                FileSystemResource zipAttachment = new FileSystemResource(zipFile);
                helper.addAttachment(zipFile.getName(), zipAttachment);
                emailSender.send(message);
                LOGGER.info("Mail send is complete");
                zipFile.delete();
            }else{
                mailStatus=false;
            }
        } catch (Exception e) {
            LOGGER.error(SEND_FAILURE, e);
            mailStatus=false;
        }finally {
            if(mailStatus){
                LOGGER.info("Start Moving file");
                File movedFileName = new File(constants.done + File.separator + attachFile.getName());
                File incomingfileName = new File(constants.incoming + File.separator + attachFile.getName());
                Path pathToFile = Paths.get(String.valueOf(incomingfileName));
                LOGGER.info(String.valueOf(pathToFile.toAbsolutePath()));
                Path temp = Files.move
                        (Paths.get(String.valueOf(incomingfileName)),
                                Paths.get(String.valueOf(movedFileName)), StandardCopyOption.REPLACE_EXISTING);
                incomingfileName.delete();
                LOGGER.info("Finished Moving file " +  temp );
                delete(7 ,constants.done,".csv");
            }
        }
    }

    private void addToZipFile(File attachFile, ZipOutputStream zipOutputStream) throws IOException {
        FileInputStream fileInputStream =  new FileInputStream(attachFile);
        ZipEntry zipEntry = new ZipEntry(attachFile.getName());
        zipOutputStream.putNextEntry(zipEntry);
        byte[] buffer = new byte[1];
        int length;
        while ((length = fileInputStream.read(buffer)) >= 0) {
            zipOutputStream.write(buffer, 0, length);
        }
        fileInputStream.close();
        zipOutputStream.closeEntry();
    }

    @Autowired
    public void setEmailSender(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void delete(long nday, String dirPath,String extension) {
        LOGGER.info(START_DELETE_7_DAY_OLD_FILE);
        File fold = new File(dirPath);
        if (fold.exists()) {
            File[] listAllFiles = fold.listFiles();
            long count = System.currentTimeMillis() -  (nday * DAY);
            LOGGER.info("File will be deleted in " + nday + " days. ");
            for (File listFile : listAllFiles) {

                if (listFile.getName().endsWith(extension) && listFile.lastModified() < count) {
                    if (!listFile.delete()) {
                        LOGGER.error(DELETE_FAILURE);
                    } else{
                        LOGGER.info("File has been deleted " + listFile.toString());
                    }
                }
            }
        }
        LOGGER.info(DELETE_7_DAY_OLD_FILE);
    }
}
