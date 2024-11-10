package za.co.fnb.cish.fid.kafka.reader.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import jakarta.jms.ConnectionFactory;


@Configuration
public class ActiveMqApp1BeanConfig {

    public static final Logger LOGGER = LoggerFactory.getLogger(ActiveMqApp1BeanConfig.class);
    @Value("${spring.activemq.app1.url}")
    private String brokerOneUrl;
    @Value("${spring.activemq.user}")
    private String brokerOneUser;
    @Value("${spring.activemq.password}")
    private String brokerOnePwd;
    @Value(value = "${spring.activemq.session-cache-size}")
    private int sessionCacheSize;
    @Value(value = "${spring.activemq.producer-window-size}")
    private int producerWindowSize;

    @Bean
    public ConnectionFactory connectionFactoryOne() {
        LOGGER.info("Step into Fid Kafka Reader connectionFactoryOne START");
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL(brokerOneUrl);
        activeMQConnectionFactory.setUserName(brokerOneUser);
        activeMQConnectionFactory.setPassword(brokerOnePwd);
        activeMQConnectionFactory.setUseAsyncSend(true);
        activeMQConnectionFactory.setCopyMessageOnSend(false);
        activeMQConnectionFactory.setTrustAllPackages(true);
        activeMQConnectionFactory.setProducerWindowSize(producerWindowSize);
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(activeMQConnectionFactory);
        cachingConnectionFactory.setSessionCacheSize(sessionCacheSize);

        cachingConnectionFactory.setExceptionListener(e -> LOGGER.error("Error while writing to active MQ", e));
        LOGGER.info("Step into Fid Kafka Reader connectionFactoryOne END");
        return cachingConnectionFactory;
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerFactoryOne(
            @Qualifier("connectionFactoryOne") ConnectionFactory connectionFactory,
            DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        return factory;
    }

    @Bean
    @Primary
    public JmsTemplate jmsTemplateOne() {
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(connectionFactoryOne());
        return jmsTemplate;
    }



}
