package za.co.fnb.cish.fid.topic.processor.jms;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessagePostProcessor;
import org.springframework.stereotype.Component;



import static za.co.fnb.cish.fid.topic.processor.util.Constants.FAILURE_CAUSE;
import static za.co.fnb.cish.fid.topic.processor.util.Constants.RETRY_COUNTER;

@Component
public class ProduceActiveMq {

    private static final Logger LOGGER = LoggerFactory.getLogger(za.co.fnb.cish.fid.topic.processor.jms.ProduceActiveMq.class);
    private static final int FAILURE_CAUSE_MAX_SIZE = 500;

    private JmsTemplate jmsTemplate;

    private JmsTemplate jmsTemplate2;

    @Autowired
    @Qualifier("jmsTemplateOne")
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Autowired
    @Qualifier("jmsTemplateTwo")
    public void setJmsTemplate2(JmsTemplate jmsTemplate2) {
        this.jmsTemplate2 = jmsTemplate2;
    }

    public void sendMsgToDLQ(String prefix, String destination, String messages, final String messageId, final Exception exception, final int retryCounter) {

        LOGGER.info("Sending message to DLQ, messageId: {}", messageId);

        try {
            LOGGER.trace("Sending JMS message for connection1: {}", messages);
            jmsTemplate.convertAndSend(prefix + destination, messages, new MessagePostProcessor() {
                @Override
                public Message postProcessMessage(Message message) throws JMSException {
                    message.setJMSCorrelationID(messageId);
                    message.setIntProperty(RETRY_COUNTER, retryCounter);

                    String failureCause;
                    if (StringUtils.isNotEmpty(exception.getMessage())) {
                        failureCause = StringUtils.truncate(exception.getMessage(), FAILURE_CAUSE_MAX_SIZE);
                    } else {
                        failureCause = StringUtils.truncate(ExceptionUtils.getStackTrace(exception), FAILURE_CAUSE_MAX_SIZE);
                    }

                    message.setStringProperty(FAILURE_CAUSE, failureCause);
                    return message;
                }
            });
            LOGGER.trace("Done sending JMS message for connection1: {}", messages);
        } catch (Exception e) {
            LOGGER.error("Error occurred while sending a message for connection1", e);
        }
    }

    public void sendMsgToDLQ2(String prefix, String destination, String messages, final String messageId, final Exception exception, final int retryCounter) {

        LOGGER.info("Sending message to DLQ, messageId: {}", messageId);

        try {
            LOGGER.trace("Sending JMS message for connection2: {}", messages);
            jmsTemplate2.convertAndSend(prefix + destination, messages, new MessagePostProcessor() {
                @Override
                public Message postProcessMessage(Message message) throws JMSException {
                    message.setJMSCorrelationID(messageId);
                    message.setIntProperty(RETRY_COUNTER, retryCounter);

                    String failureCause;
                    if (StringUtils.isNotEmpty(exception.getMessage())) {
                        failureCause = StringUtils.truncate(exception.getMessage(), FAILURE_CAUSE_MAX_SIZE);
                    } else {
                        failureCause = StringUtils.truncate(ExceptionUtils.getStackTrace(exception), FAILURE_CAUSE_MAX_SIZE);
                    }

                    message.setStringProperty(FAILURE_CAUSE, failureCause);
                    return message;
                }
            });
            LOGGER.trace("Done sending JMS message for connection2: {}", messages);
        } catch (Exception e) {
            LOGGER.error("Error occurred while sending a message for connection2", e);
        }
    }

    public void resendMsg(String destination, String messages, String messageId, int retryCounter) {
        try {
            LOGGER.trace("Sending JMS message for connection1: {}", messages);
            jmsTemplate.convertAndSend(destination, messages, new MessagePostProcessor() {
                @Override
                public Message postProcessMessage(Message message) throws JMSException {
                    message.setJMSCorrelationID(messageId);
                    message.setIntProperty(RETRY_COUNTER, retryCounter);

                    return message;
                }
            });
            LOGGER.trace("Done sending JMS message : {}", messages);
        } catch (Exception e) {
            LOGGER.error("Error occurred while sending a message for connection1", e);
        }
    }

    public void resendMsg2(String destination, String messages, String messageId, int retryCounter) {
        try {
            LOGGER.trace("Sending JMS message for connection2: {}", messages);
            jmsTemplate2.convertAndSend(destination, messages, new MessagePostProcessor() {
                @Override
                public Message postProcessMessage(Message message) throws JMSException {
                    message.setJMSCorrelationID(messageId);
                    message.setIntProperty(RETRY_COUNTER, retryCounter);

                    return message;
                }
            });
            LOGGER.trace("Done sending JMS message : {}", messages);
        } catch (Exception e) {
            LOGGER.error("Error occurred while sending a message for connection2", e);
        }
    }
}