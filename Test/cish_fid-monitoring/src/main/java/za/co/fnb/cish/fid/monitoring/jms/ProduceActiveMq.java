package za.co.fnb.cish.fid.monitoring.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Component
public class ProduceActiveMq {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProduceActiveMq.class);

    @Autowired
    public ProduceActiveMq(JmsTemplate jmsTemplate) {
    }
}
