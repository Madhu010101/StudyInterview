/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.fnb.cish.fid.monitoring.configuration;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.client.RestTemplate;

import java.time.format.DateTimeFormatter;
import java.util.Properties;

import static za.co.fnb.cish.fid.monitoring.util.Constants.ACTIVEMQ_ERROR;

/**
 * @author f2865912
 */
@Configuration
public class BeanConfig {

    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.ssXXX";
    private static final Logger LOGGER = LoggerFactory.getLogger(BeanConfig.class);
    @Value(value = "${spring.activemq.user}")
    private String username;
    @Value(value = "${spring.activemq.password}")
    private String password;
    @Value(value = "${spring.activemq.app1.url}")
    private String brokerUrl;
    @Value(value = "${spring.activemq.app2.url}")
    private String brokerUrl2;
    
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jsonCustomizer() {
        return builder -> {
            builder.simpleDateFormat(DATE_TIME_FORMAT);
            builder.serializers(new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(DATE_TIME_FORMAT)));
        };
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("mail.fnb.co.za");
        mailSender.setPort(25);

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "false");
        props.put("mail.debug", "true");

        return mailSender;
    }

    @Bean
    public ConnectionFactory connectionFactory() {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(brokerUrl);
        factory.setTrustAllPackages(true);
        factory.setUserName(username);
        factory.setPassword(password);
        factory.setCopyMessageOnSend(false);
        factory.setUseAsyncSend(true);

        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(factory);

        cachingConnectionFactory.setExceptionListener(e -> LOGGER.error(ACTIVEMQ_ERROR, e));
        return cachingConnectionFactory;
    }

    @Bean
    public ConnectionFactory connectionFactory2() {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(brokerUrl2);
        factory.setTrustAllPackages(true);
        factory.setUserName(username);
        factory.setPassword(password);
        factory.setCopyMessageOnSend(false);
        factory.setUseAsyncSend(true);

        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(factory);

        cachingConnectionFactory.setExceptionListener(e -> LOGGER.error(ACTIVEMQ_ERROR, e));
        return cachingConnectionFactory;
    }

}
