package za.co.fnb.cish.fid.monitoring.util;

import jakarta.annotation.PostConstruct;
import org.jolokia.client.J4pClient;
import org.jolokia.client.exception.J4pException;
import org.jolokia.client.exception.J4pRemoteException;
import org.jolokia.client.request.J4pReadRequest;
import org.jolokia.client.request.J4pResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/*import javax.annotation.PostConstruct;*/
import javax.management.MalformedObjectNameException;

@Configuration
public class ActiveMQClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(ActiveMQClient.class);
    @Value("${spring.activemq.user}")
    private String user;
    @Value("${spring.activemq.password}")
    private String password;
    @Value("${spring.activemq.app1.jolokia-url}")
    private String jolokiaUrl1;
    @Value("${spring.activemq.app1.broker-name}")
    private String brokerName1;
    @Value("${spring.activemq.app2.jolokia-url}")
    private String jolokiaUrl2;
    @Value("${spring.activemq.app2.broker-name}")
    private String brokerName2;
    private J4pClient j4pClient1;
    private J4pClient j4pClient2;


    @PostConstruct
    public void setJ4pClients() {
        j4pClient1 = J4pClient.url(jolokiaUrl1)
                .user(user)
                .password(password)
                .build();
        j4pClient2 = J4pClient.url(jolokiaUrl2)
                .user(user)
                .password(password)
                .build();
    }

    public Long getQueueSize1(String queueName) {
        try {
            J4pReadRequest j4pReadRequest = new J4pReadRequest("org.apache.activemq:brokerName=" + brokerName1 + ",destinationName=" + queueName + ",destinationType=Queue,type=Broker", "QueueSize");
            LOGGER.debug("Incoming queueList 101: {},password:{},brokerName1:{}", j4pReadRequest,password,brokerName1);
            J4pResponse<J4pReadRequest> response = j4pClient1.execute(j4pReadRequest);
            LOGGER.info("queueSize for {} on app1 is {}", queueName, response.getValue());
            return response.getValue();
        } catch (MalformedObjectNameException | J4pException e) {
            if (((J4pRemoteException) e).getStatus() == 404) {
                return 0L;
            } else {
                LOGGER.error("error with getting queue size ", e);
                return null;
            }
        }
    }

    public Long getQueueSize2(String queueName) {
        try {
            J4pReadRequest j4pReadRequest = new J4pReadRequest("org.apache.activemq:brokerName=" + brokerName2 + ",destinationName=" + queueName + ",destinationType=Queue,type=Broker", "QueueSize");
            J4pResponse<J4pReadRequest> response = j4pClient2.execute(j4pReadRequest);
            LOGGER.info("queueSize for {} on app2 is {}", queueName, response.getValue());
            return response.getValue();
        } catch (MalformedObjectNameException | J4pException e) {
            if (((J4pRemoteException) e).getStatus() == 404) {
                return 0L;
            } else {
                LOGGER.error("error with getting queue size ", e);
                return null;
            }
        }
    }


}