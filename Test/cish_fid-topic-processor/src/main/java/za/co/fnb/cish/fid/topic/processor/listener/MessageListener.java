package za.co.fnb.cish.fid.topic.processor.listener;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.hibernate.StaleObjectStateException;
import org.hibernate.StaleStateException;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.support.JmsHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.CannotCreateTransactionException;
import za.co.fnb.cish.fid.common.api.fidmaster.EventOrigin;
import za.co.fnb.cish.fid.common.api.fidmaster.FirstIdMasterEntity;
import za.co.fnb.cish.fid.common.api.fidmaster.Message;
import za.co.fnb.cish.fid.repo.model.events.Event;
import za.co.fnb.cish.fid.repo.repository.events.EventRepository;
import za.co.fnb.cish.fid.topic.processor.jms.ProduceActiveMq;
import za.co.fnb.cish.fid.topic.processor.util.FirstIdMasterSourceMapper;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import static za.co.fnb.cish.fid.topic.processor.util.Constants.*;

@Component
@DependsOn("FirstIdMasterSourceMapper")
public class MessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);
    private final ObjectMapper mapper;
    public static final String REMOVE = "queue://";
    private ProduceActiveMq produceActiveMq;
    private FirstIdMasterSourceMapper firstIdMasterSourceMapper;
    private EventRepository eventRepository;
    private MessageListenerImpl messageListenerImpl;

    public MessageListener() {
        this.mapper = new ObjectMapper();
        this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    }

    @JmsListener(destination = "${customer.fid.queue}", concurrency = "${customer.fid.concurrent_consumers}", containerFactory = "jmsListenerContainerFactory")
    public void onMessage(String msg, @Header(JmsHeaders.MESSAGE_ID) String mId, @Header(name = JmsHeaders.CORRELATION_ID, required = false, defaultValue = "") String correlationId
            , @Header(name = RETRY_COUNTER, required = false, defaultValue = "0") String retryCounter, @Header(JmsHeaders.DESTINATION) String q) throws Exception {
        long start = System.currentTimeMillis();
        String messageId = StringUtils.isBlank(correlationId) ? mId : correlationId;
        String queueName = StringUtils.remove(q, REMOVE);
        Message msgObj = null;
        LOGGER.info("Start processing message from the queue, message:  {}", msg);
        try {
            LOGGER.trace(msg);
            String message = StringUtils.replace(msg, IBM_NULL_VALUE, "");
            msgObj = mapper.readValue(message, Message.class);
            FirstIdMasterEntity firstIdMasterEntity = mapper.readValue(msgObj.getValue(), FirstIdMasterEntity.class);
            if (Objects.nonNull(firstIdMasterEntity) && Objects.nonNull(firstIdMasterEntity.getEventHeader())
                    && Objects.nonNull(firstIdMasterEntity.getEventHeader().getEventOrigins())) {
                List<EventOrigin> evntOrgn = firstIdMasterEntity.getEventHeader().getEventOrigins();
                for (EventOrigin orin : evntOrgn) {
                    if (Objects.nonNull(orin.getEventOriginSourceSystemCode()
                    ) && orin.getEventOriginSourceSystemCode().equalsIgnoreCase("CRE")) {
                        LOGGER.info("CRE EventOrigin :  {}", orin.getEventOriginSourceSystemCode());
                        za.env.raw.opm.firstidmasterentity.FirstIdMasterEntity firstId = firstIdMasterSourceMapper.map(firstIdMasterEntity);
                        createOrUpdateEvent(firstId, msgObj, firstIdMasterEntity.getKey().getKeyIdentifierNumber());
                        LOGGER.info("consumed Record from topic:{}, with key :{} completed in {} ms", msgObj.getTopic(), msgObj.getKey(), System.currentTimeMillis() - start);
                    }
                }

            }

        } catch (DataIntegrityViolationException | ObjectOptimisticLockingFailureException e) {
            LOGGER.error("Error occurred while while processing customer key base topic record, messageId= {}", messageId, e);
            int counter = NumberUtils.toInt(retryCounter, 0);

            if ((e.getCause() instanceof ConstraintViolationException || e.getCause() instanceof StaleObjectStateException || e.getCause() instanceof StaleStateException) && counter <= 3) {
                counter++;
                LOGGER.info("Resending message to Queue, messageId= {}", messageId);
                produceActiveMq.resendMsg(queueName, msg, messageId, counter);
            } else {
                counter++;
                produceActiveMq.sendMsgToDLQ(DLQ, queueName, msg, messageId, e, counter);
            }
        } catch (CannotCreateTransactionException e) {
            LOGGER.error(DB_CONNECT_ERROR_MSG, messageId, e);
            messageListenerImpl.retryConnection(msg, retryCounter, messageId, queueName);
        } catch (Exception e) {
            LOGGER.error("Error occurred while while processing topic processor record, messageId= {}", messageId, e);
            int counter = NumberUtils.toInt(retryCounter, 0);
            counter++;
            produceActiveMq.sendMsgToDLQ(DLQ, queueName, msg, messageId, e, counter);
        }

    }

    @JmsListener(destination = "${customer.fid.queue}", concurrency = "${customer.fid.concurrent_consumers}", containerFactory = "jmsListenerContainerFactory2")
    public void onMessage2(String msg, @Header(JmsHeaders.MESSAGE_ID) String mId, @Header(name = JmsHeaders.CORRELATION_ID, required = false, defaultValue = "") String correlationId
            , @Header(name = RETRY_COUNTER, required = false, defaultValue = "0") String retryCounter, @Header(JmsHeaders.DESTINATION) String q) throws Exception {
        long start = System.currentTimeMillis();
        String messageId = StringUtils.isBlank(correlationId) ? mId : correlationId;
        String queueName = StringUtils.remove(q, REMOVE);
        Message msgObj = null;
        LOGGER.info("Start processing message from the queue, message:  {}", msg);
        try {
            LOGGER.trace(msg);
            String message = StringUtils.replace(msg, IBM_NULL_VALUE, "");
            msgObj = mapper.readValue(message, Message.class);
            FirstIdMasterEntity firstIdMasterEntity = mapper.readValue(msgObj.getValue(), FirstIdMasterEntity.class);
            if (Objects.nonNull(firstIdMasterEntity) && Objects.nonNull(firstIdMasterEntity.getEventHeader())
                    && Objects.nonNull(firstIdMasterEntity.getEventHeader().getEventOrigins())) {
                List<EventOrigin> evntOrgn = firstIdMasterEntity.getEventHeader().getEventOrigins();
                for (EventOrigin orin : evntOrgn) {
                    if (Objects.nonNull(orin.getEventOriginSourceSystemCode()
                    ) && orin.getEventOriginSourceSystemCode().equalsIgnoreCase("CRE")) {
                        LOGGER.info("CRE EventOrigin :  {}", orin.getEventOriginSourceSystemCode());
                        za.env.raw.opm.firstidmasterentity.FirstIdMasterEntity firstId = firstIdMasterSourceMapper.map(firstIdMasterEntity);
                        createOrUpdateEvent(firstId, msgObj, firstIdMasterEntity.getKey().getKeyIdentifierNumber());
                        LOGGER.info("consumed Record from topic:{}, with key :{} completed in {} ms", msgObj.getTopic(), msgObj.getKey(), System.currentTimeMillis() - start);
                    }
                }

            }

        } catch (DataIntegrityViolationException | ObjectOptimisticLockingFailureException e) {
            LOGGER.error("Error occurred while while processing customer key base topic record, messageId= {}", messageId, e);
            int counter = NumberUtils.toInt(retryCounter, 0);

            if ((e.getCause() instanceof ConstraintViolationException || e.getCause() instanceof StaleObjectStateException || e.getCause() instanceof StaleStateException) && counter <= 3) {
                counter++;
                LOGGER.info("Resending message to Queue, messageId= {}", messageId);
                produceActiveMq.resendMsg2(queueName, msg, messageId, counter);
            } else {
                counter++;
                produceActiveMq.sendMsgToDLQ2(DLQ, queueName, msg, messageId, e, counter);
            }
        } catch (CannotCreateTransactionException e) {
            LOGGER.error(DB_CONNECT_ERROR_MSG, messageId, e);
            messageListenerImpl.retryConnection(msg, retryCounter, messageId, queueName);
        } catch (Exception e) {
            LOGGER.error("Error occurred while while processing topic processor record, messageId= {}", messageId, e);
            int counter = NumberUtils.toInt(retryCounter, 0);
            counter++;
            produceActiveMq.sendMsgToDLQ2(DLQ, queueName, msg, messageId, e, counter);
        }

    }

    private void createOrUpdateEvent(za.env.raw.opm.firstidmasterentity.FirstIdMasterEntity transformMessages, Message fidMessage, String keyIdentifierNumber) throws JsonProcessingException {
        LOGGER.debug("createOrUpdate fid DB : {}", transformMessages);

        Event event = new Event();
        event.setKeyidentifiernumber(keyIdentifierNumber);
        event.setFid_messages(fidMessage.getValue());
        event.setTransformed_messages(transformMessages.toString());
        event.setEvent_type(transformMessages.getEventHeader().getEventAction());
        event.setEvent_status(false);
        event.setDate(Timestamp.valueOf(LocalDateTime.now()));
        eventRepository.persist(event);
        LOGGER.info("Record inserted key_identifier_no : {}", transformMessages.getKey().getKeyIdentifierNumber());


    }

    @Autowired
    public void setFirstIdMasterSourceMapper(FirstIdMasterSourceMapper firstIdMasterSourceMapper) {
        this.firstIdMasterSourceMapper = firstIdMasterSourceMapper;
    }

    @Autowired
    public void setEventRepository(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Autowired
    public void setProduceActiveMq(ProduceActiveMq produceActiveMq) {
        this.produceActiveMq = produceActiveMq;
    }

    @Autowired
    public void setMessageListenerImpl(MessageListenerImpl messageListenerImpl) {
        this.messageListenerImpl = messageListenerImpl;
    }
}
