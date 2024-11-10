package za.co.fnb.cish.fid.kafka.reader.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author f2865912
 */
@Component
public class ProduceActiveMq {


    private static final Logger LOGGER = LoggerFactory.getLogger(ProduceActiveMq.class);


    private JmsTemplate jmsTemplate1;
    private JmsTemplate jmsTemplate2;
    List<JmsTemplate> jmsTemplateList = new ArrayList<>();

    @Autowired
    @Qualifier("jmsTemplateOne")
    private void setJmsTemplate1(JmsTemplate jmsTemplateOne) {
        this.jmsTemplate1 = jmsTemplateOne;
        LOGGER.info("Inside setJmsTemplateOne");
        if (!jmsTemplateList.contains(jmsTemplate1)) {
            jmsTemplateList.add(jmsTemplate1);
        }
    }

    @Autowired
    @Qualifier("jmsTemplateTwo")
    private void setJmsTemplate2(JmsTemplate jmsTemplateTwo) {
        this.jmsTemplate2 = jmsTemplateTwo;
        LOGGER.info("Inside setJmsTemplateTwo");
        if (!jmsTemplateList.contains(jmsTemplate2)) {
            jmsTemplateList.add(jmsTemplate2);
        }
    }
 /*   @Autowired
    public ProduceActiveMq(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }*/

    public void sendMsg(String destination, String record) {
        LOGGER.trace("Sending JMS message: {}", record);
        List<JmsTemplate> localJmsList = new ArrayList<>(jmsTemplateList);
        int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
        localJmsList.get(randomNum).convertAndSend(destination, record);

        LOGGER.trace("Done sending JMS message : {}", record);
    }
}