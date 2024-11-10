package za.co.fnb.cish.fid.kafka.reader.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.listener.CommonErrorHandler;
import org.springframework.kafka.listener.CommonLoggingErrorHandler;


@Configuration
public class BeanConfig {

    public static final Logger LOGGER = LoggerFactory.getLogger(BeanConfig.class);

    @Value(value = "${spring.activemq.broker-url}")
    private String brokerUrl;
    @Value(value = "${spring.activemq.user}")
    private String username;
    @Value(value = "${spring.activemq.password}")
    private String password;
    //@Value(value = "${spring.activemq.asyncSend}")
   // private boolean asyncSend;
    @Value(value = "${spring.activemq.producer-window-size}")
    private int producerWindowSize;
    @Value(value = "${spring.activemq.session-cache-size}")
    private int sessionCacheSize;

    @Bean
    public CommonErrorHandler errorHandler() {
        return new CommonLoggingErrorHandler();
    }

  /*  @Bean
    public ConnectionFactory connectionFactory(){

        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(brokerUrl);
        factory.setTrustAllPackages(true);
        factory.setUseAsyncSend(asyncSend);
        factory.setUserName(username);
        factory.setPassword(password);
        factory.setProducerWindowSize(producerWindowSize);
        factory.setCopyMessageOnSend(false);

        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory(factory);
        cachingConnectionFactory.setSessionCacheSize(sessionCacheSize);

        cachingConnectionFactory.setExceptionListener(new ExceptionListener() {
            @Override
            public void onException(JMSException e) {
                LOGGER.error("Error while writing to active MQ", e);
            }
        });
        return cachingConnectionFactory;
    }
*/


}
