package za.co.fnb.cish.fid.topic.processor.listener;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.config.JmsListenerEndpointRegistry;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.topic.processor.jms.ProduceActiveMq;

import javax.sql.DataSource;

import static za.co.fnb.cish.fid.topic.processor.util.Constants.DB_CONNECTION_SLEEP;
import static za.co.fnb.cish.fid.topic.processor.util.Constants.DB_CONNECT_ATTEMPT;

@Component
public class MessageListenerImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);
    private ProduceActiveMq produceActiveMq;
    private JmsListenerEndpointRegistry jmsListenerEndpointRegistry;
    private DataSource dataSource;
    @Value("${spring.datasource.hikari.maximumPoolSize}")
    private String maxPoolSize;

    public void retryConnection(String message, String retryCounter, String messageId, String queueName) throws InterruptedException {
        int counter = NumberUtils.toInt(retryCounter, 0);
        jmsListenerEndpointRegistry.stop();
        HikariDataSource hikariDataSource = (HikariDataSource) dataSource;
        int maxPoolCapacity = Integer.parseInt(maxPoolSize);
        int currentConnectionCount = maxPoolCapacity;

        while (currentConnectionCount >= maxPoolCapacity) {
            Thread.sleep(DB_CONNECTION_SLEEP);
            currentConnectionCount = hikariDataSource.getHikariPoolMXBean().getActiveConnections();
            LOGGER.info(DB_CONNECT_ATTEMPT, ++counter);
        }
        produceActiveMq.resendMsg(queueName, message, messageId, counter);
        jmsListenerEndpointRegistry.start();
    }

    @Autowired
    public void setProduceActiveMq(ProduceActiveMq produceActiveMq) {
        this.produceActiveMq = produceActiveMq;
    }

    @Autowired
    public void setJmsListenerEndpointRegistry(JmsListenerEndpointRegistry jmsListenerEndpointRegistry) {
        this.jmsListenerEndpointRegistry = jmsListenerEndpointRegistry;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}