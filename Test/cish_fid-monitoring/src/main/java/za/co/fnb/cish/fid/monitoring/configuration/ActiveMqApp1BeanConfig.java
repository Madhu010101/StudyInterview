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
import org.springframework.context.annotation.Primary;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

import static za.co.fnb.cish.fid.monitoring.util.Constants.ACTIVEMQ_ERROR;

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

        cachingConnectionFactory.setExceptionListener(e -> LOGGER.error(ACTIVEMQ_ERROR, e));
        return cachingConnectionFactory;
    }

    @Bean("TwojmsListenerContainerFactory")
    public JmsListenerContainerFactory<?> jmsListenerContainerFactoryOne(@Qualifier("connectionFactoryOne") ConnectionFactory connectionFactory, DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        return factory;
    }

    @Bean
    @Primary
    public JmsTemplate jmsTemplate() {
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(connectionFactoryOne());
        return jmsTemplate;
    }


}
