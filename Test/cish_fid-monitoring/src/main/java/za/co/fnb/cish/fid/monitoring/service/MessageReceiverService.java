package za.co.fnb.cish.fid.monitoring.service;

import jakarta.jms.*;
import jakarta.jms.Queue;
import org.apache.activemq.command.ActiveMQMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.monitoring.util.Constants;
import za.co.fnb.cish.fid.monitoring.util.FileManager;
import za.co.fnb.cish.fid.monitoring.util.ActiveMQClient;
import za.co.fnb.cish.fid.monitoring.util.CSVItem;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import static za.co.fnb.cish.fid.monitoring.util.Constants.JMS_TIMEOUT;

@Component
public class MessageReceiverService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageReceiverService.class);

    List<CSVItem> csvItem = new ArrayList();
    @Autowired
    ActiveMQClient activeMQClient;
    @Autowired
    private FileManager fileManager;
    private ConnectionFactory connectionFactory;
    @Value("#{'${dlq-queues}'}")
    private String queue;


    private ConnectionFactory connectionFactory2;

    @Autowired
    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
    @Autowired
    public void setConnectionFactory2(ConnectionFactory connectionFactory2) {
        this.connectionFactory2 = connectionFactory2;
    }

    public File readDlqMesg() {
        File file = null;
        String yyyMMdd = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyMMdd"));
        String fileNameString =  Constants.FILENAME + yyyMMdd + Constants.FILEEXTENSION;
        csvItem.clear();
        try {
            int count = 0;
            LOGGER.debug("Incoming queue : {}", queue);

            Session session = connectionFactory.createConnection().createSession(false, Session.CLIENT_ACKNOWLEDGE);
            Destination destination = session.createQueue(queue);
            MessageConsumer consumer = session.createConsumer(destination);
            QueueBrowser browser = session.createBrowser((Queue) destination);
            LOGGER.debug("Incoming Message browser : {}", browser);
            connectionFactory.createConnection().start();
            Enumeration elems = browser.getEnumeration();

            while (elems.hasMoreElements()) {
                count = count + 1;
                Message message = consumer.receive(JMS_TIMEOUT);
                if(message == null){
                    consumer.close();
                    session.close();
                    browser.close();
                    break;
                }

                if (message instanceof TextMessage) {
                    TextMessage textMessage = (TextMessage) message;
                    csvItem.add(setDataCsv(queue, message, textMessage));
                } else{
                    break;
                }
            }
            if (Objects.nonNull(csvItem) && !csvItem.isEmpty()) {
                file = fileManager.csvGeneratorForDB(csvItem, fileNameString , "DLQ");
            }
            return file;
        } catch (JMSException | IOException e) {
            LOGGER.error("JMSException :{}", e);
            return file;
        } finally {
            try {
                connectionFactory.createConnection().close();
            } catch (JMSException e) {
                LOGGER.error("Failure to close connection :{}", e);
            }
        }
    }

    public File readDlqMesg2() {
        File file = null;
        String yyyMMdd = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyMMdd"));
        String fileNameString =  Constants.FILENAME + yyyMMdd + Constants.FILEEXTENSION;
        csvItem.clear();
        try {
            int count = 0;
            LOGGER.debug("Incoming queue : {}", queue);

            Session session = connectionFactory2.createConnection().createSession(false, Session.CLIENT_ACKNOWLEDGE);
            Destination destination = session.createQueue(queue);
            MessageConsumer consumer = session.createConsumer(destination);
            QueueBrowser browser = session.createBrowser((Queue) destination);
            LOGGER.debug("Incoming Message browser : {}", browser);
            connectionFactory2.createConnection().start();
            Enumeration elems = browser.getEnumeration();

            while (elems.hasMoreElements()) {
                count = count + 1;
                Message message = consumer.receive(JMS_TIMEOUT);
                if(message == null){
                    consumer.close();
                    session.close();
                    browser.close();
                    break;
                }

                if (message instanceof TextMessage) {
                    TextMessage textMessage = (TextMessage) message;
                    csvItem.add(setDataCsv(queue, message, textMessage));
                } else{
                    break;
                }
            }
            if (Objects.nonNull(csvItem) && !csvItem.isEmpty()) {
                file = fileManager.csvGeneratorForDB(csvItem, fileNameString , "DLQ");
            }
            return file;
        } catch (JMSException | IOException e) {
            LOGGER.error("JMSException :{}", e);
            return file;
        } finally {
            try {
                connectionFactory2.createConnection().close();
            } catch (JMSException e) {
                LOGGER.error("Failed to close connection :{}", e);
            }
        }
    }
    private CSVItem setDataCsv(String qname, Message message, TextMessage textMessage) throws IOException, JMSException {
        CSVItem csvfile = new CSVItem();
        try{
            ActiveMQMessage activeMQMessage;
            activeMQMessage = (ActiveMQMessage) textMessage;
            Map propsMap = Objects.nonNull(activeMQMessage.getProperties()) ? activeMQMessage.getProperties() : null;
            csvfile.setQueueName(qname);
            getErrorMes(propsMap);
            csvfile.setError(getErrorMes(propsMap));
            csvfile.setMessage(((TextMessage) message).getText());
            Timestamp mqtimestamp = new Timestamp(textMessage.getJMSTimestamp());
            csvfile.setDate(getStrDate(mqtimestamp));
        }catch (Exception e){
            LOGGER.error("Exception :{}", e);
        }
        return csvfile;
    }

    private String getErrorMes(Map propsMap) {
        String errorMesg = " ";
        String[] meg;
        if (propsMap.size() > 0) {
            errorMesg = propsMap.get("FailureCause").toString();
            if (errorMesg.length() >= 200 ) {
                errorMesg = errorMesg.substring(0, 200);
            }
        }
        return errorMesg;
    }

    private String getStrDate(Timestamp tdate) {
        String sdate = "";
        if(Objects.nonNull(tdate)){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm");
            sdate = formatter.format(tdate);
        }
        return sdate;
    }

}
