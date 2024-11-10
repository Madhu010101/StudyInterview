package za.co.fnb.cish.fid.monitoring.cleanup;

import jakarta.jms.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import za.co.fnb.cish.fid.monitoring.util.ActiveMQClient;
import za.co.fnb.cish.fid.monitoring.util.AppProperties;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Enumeration;


@Service
public class DLQCleanupService {

    private static final Logger LOGGER = LoggerFactory.getLogger( DLQCleanupService.class);

    @Autowired
    ActiveMQClient activeMQClient;
    @Autowired
    AppProperties appProperties;
    private ConnectionFactory connectionFactory;
    @Value("${dlq-queues}")
    private String queue;

    private ConnectionFactory connectionFactory2;

    
    @Autowired
    @Qualifier("connectionFactoryOne")
    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
    @Autowired
    @Qualifier("connectionFactoryTwo")
    public void setConnectionFactory2(ConnectionFactory connectionFactory2) {
        this.connectionFactory2 = connectionFactory2;
    }

    public void readAndDeleteDLQs() {
        String dlqName = queue;
        Session session = null;
        try {
            Timestamp dlqCuttOffTimestamp = Timestamp.valueOf(LocalDate.now().minusDays(Long.parseLong(appProperties.getDlqCleanUpDays())).atStartOfDay());
            LOGGER.info("DLQ Name: {}", dlqName);
            session = connectionFactory.createConnection().createSession(false, Session.CLIENT_ACKNOWLEDGE);
            Destination destination = session.createQueue(queue);
            MessageConsumer consumer = session.createConsumer(destination);
            QueueBrowser browser = session.createBrowser((Queue) destination);
            LOGGER.info("Incoming Message browser : {}", browser);
            connectionFactory.createConnection().start();

            Enumeration elems = browser.getEnumeration();
            while (elems.hasMoreElements()) {
                Message message = (Message) consumer.receive(1);
                if(message == null){
                    consumer.close();
                    session.close();
                    browser.close();
                    break;
                }

                if (message instanceof TextMessage) {
                    if (message.getJMSTimestamp() < dlqCuttOffTimestamp.getTime()) {
                        message.acknowledge();
                    }
                } else {
                    break;
                }
            }
        } catch (JMSException e) {
            LOGGER.error("JMSException :{}", e);
        } finally {
            try {
                session.close();
            } catch (JMSException e) {
                LOGGER.error("Failed to close connection :{}", e);
            }
        }
    }

    public void readAndDeleteDLQs2() {
        String dlqName = queue;
        Session session = null;
        try {
            Timestamp dlqCuttOffTimestamp = Timestamp.valueOf(LocalDate.now().minusDays(Long.parseLong(appProperties.getDlqCleanUpDays())).atStartOfDay());
            LOGGER.info("DLQ Name: {}", dlqName);
            session = connectionFactory2.createConnection().createSession(false, Session.CLIENT_ACKNOWLEDGE);
            Destination destination = session.createQueue(queue);
            MessageConsumer consumer = session.createConsumer(destination);
            QueueBrowser browser = session.createBrowser((Queue) destination);
            LOGGER.info("Incoming Message browser : {}", browser);
            connectionFactory2.createConnection().start();

            Enumeration elems = browser.getEnumeration();
            while (elems.hasMoreElements()) {
                Message message = (Message) consumer.receive(1);
                if(message == null){
                    consumer.close();
                    session.close();
                    browser.close();
                    break;
                }

                if (message instanceof TextMessage) {
                    if (message.getJMSTimestamp() < dlqCuttOffTimestamp.getTime()) {
                        message.acknowledge();
                    }
                }else{
                    break;
                }
            }
        } catch (JMSException e) {
            LOGGER.error("JMSException :{}", e);
        } finally {
            try {
                session.close();
            } catch (JMSException e) {
                LOGGER.error("Failure to close connection :{}", e);
            }
        }
    }
}
