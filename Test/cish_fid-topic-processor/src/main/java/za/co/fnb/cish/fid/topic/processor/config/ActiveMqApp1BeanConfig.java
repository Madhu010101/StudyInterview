package za.co.fnb.cish.fid.topic.processor.config;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.ExceptionListener;
import jakarta.jms.JMSException;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;


@Configuration
@EnableJpaRepositories(basePackages = "za.co.fnb.cish.fid")
@EntityScan(basePackages = {"za.co.fnb.cish.fid.repo.model"})
public class ActiveMqApp1BeanConfig {
    public static final Logger LOGGER = LoggerFactory.getLogger(za.co.fnb.cish.fid.topic.processor.config.ActiveMqApp1BeanConfig.class);
    @Value(value = "${spring.activemq.user}")
    private String username;
    @Value(value = "${spring.activemq.password}")
    private String password;
    @Value(value = "${spring.activemq.broker-one.url}")
    private String brokerUrl;
    @Bean(name = "connectionFactory")
    public ConnectionFactory connectionFactory() {

        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(brokerUrl);
        factory.setTrustAllPackages(true);
        factory.setUserName(username);
        factory.setPassword(password);
        factory.setCopyMessageOnSend(false);
        factory.setUseAsyncSend(true);

        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(factory);

        LOGGER.info("connection done successfully to topic with ActiveMqApp1BeanConfig connectionFactory ");

        cachingConnectionFactory.setExceptionListener(new ExceptionListener() {
            @Override
            public void onException(JMSException e) {
                LOGGER.error("Error while consuming from active MQ", e);
            }
        });
        return cachingConnectionFactory;
    }

    @Bean(name = "jmsListenerContainerFactory")
    public JmsListenerContainerFactory<?> jmsListenerContainerFactory2(
            @Qualifier("connectionFactory")ConnectionFactory connectionFactory,
            DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        configurer.configure(factory,connectionFactory);
        return factory;
    }

    @Bean
    public JmsTemplate jmsTemplateOne() {
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(connectionFactory());
        return jmsTemplate;
    }


}
