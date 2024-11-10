package za.co.fnb.cish.fid.monitoring.configuration;

import jakarta.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

import static za.co.fnb.cish.fid.monitoring.util.Constants.ACTIVEMQ_ERROR;

@Configuration
public class ActiveMqApp2BeanConfig {

    public static final Logger LOGGER = LoggerFactory.getLogger(ActiveMqApp1BeanConfig.class);

    @Value("${spring.activemq.app2.url}")
    private String brokerTwoUrl;
    @Value("${spring.activemq.user}")
    private String brokerTwoUser;
    @Value("${spring.activemq.password}")
    private String brokerTwoPwd;
    @Value(value = "${spring.activemq.session-cache-size}")
    private int sessionCacheSize;
    @Value(value = "${spring.activemq.producer-window-size}")
    private int producerWindowSize;

    @Bean
    public ConnectionFactory connectionFactoryTwo() {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL(brokerTwoUrl);
        activeMQConnectionFactory.setUserName(brokerTwoUser);
        activeMQConnectionFactory.setPassword(brokerTwoPwd);
        activeMQConnectionFactory.setUseAsyncSend(true);
        activeMQConnectionFactory.setCopyMessageOnSend(false);
        activeMQConnectionFactory.setTrustAllPackages(true);
        activeMQConnectionFactory.setProducerWindowSize(producerWindowSize);
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(activeMQConnectionFactory);
        cachingConnectionFactory.setSessionCacheSize(sessionCacheSize);

        cachingConnectionFactory.setExceptionListener(e -> LOGGER.error(ACTIVEMQ_ERROR, e));
        return cachingConnectionFactory;
    }

    @Bean("jmsListenerContainerFactory")
    public JmsListenerContainerFactory<?> jmsListenerContainerFactoryTwo(
            @Qualifier("connectionFactoryTwo") ConnectionFactory connectionFactory,
            DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        return factory;
    }

    @Bean
    public JmsTemplate jmsTemplateTwo() {
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(connectionFactoryTwo());
        return jmsTemplate;
    }
}
