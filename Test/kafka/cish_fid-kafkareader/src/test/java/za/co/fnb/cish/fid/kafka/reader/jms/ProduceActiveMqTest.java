package za.co.fnb.cish.fid.kafka.reader.jms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProduceActiveMqTest {

    @Autowired
    private ProduceActiveMq activeMq;

    @MockBean
    private JmsTemplate jmsTemplate;

    @Test
    public void sendMsg() {
        activeMq.sendMsg("Destination", "{\"topic\":\"topicName\"}, \"value\":{}");
        Mockito.verify(jmsTemplate).convertAndSend("Destination", "{\"topic\":\"topicName\"}, \"value\":{}");
    }
}