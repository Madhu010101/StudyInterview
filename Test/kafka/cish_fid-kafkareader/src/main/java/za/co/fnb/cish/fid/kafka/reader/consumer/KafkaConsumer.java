package za.co.fnb.cish.fid.kafka.reader.consumer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.TopicPartition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.listener.ConsumerSeekAware;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.kafka.reader.jms.ProduceActiveMq;

import java.io.IOException;
import java.util.Collection;

/**
 * @author f2865912
 */
@Component
@EnableKafka
public class KafkaConsumer implements ConsumerSeekAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    private final ObjectMapper mapper;

    @Value(value = "${filter.key}")
    private String filterKey;
    @Value(value = "${filter.value}")
    private String filterValue;
    @Value(value = "${spring.kafka.properties.schema.name}")
    private String schemaName;
    @Value(value = "${spring.kafka.properties.schema.version}")
    private String schemaVersion;
    @Value(value = "${spring.kafka.properties.schema.host}")
    private String host;
    @Value(value = "${spring.kafka.properties.schema.port}")
    private String port;
    @Value(value = "${spring.kafka.properties.schema.http-protocol}")
    private String httpProtocol;
    @Value(value = "${spring.kinit.keyTabPath}")
    private String keytabLocation;
    @Value(value = "${spring.kinit.principal}")
    private String userPrincipal;
    @Value(value = "${customer.fid.queue}")
    private String fidQueue;
    @Autowired
    private ProduceActiveMq activeMq;

    public KafkaConsumer(KafkaListenerEndpointRegistry registry) {
        mapper = new ObjectMapper();
    }

    @KafkaListener(topics = "#{'${spring.kafka.consumer.topics}'.split(',')}", groupId = "${spring.kafka.consumer.group-id}", concurrency = "${customer.cache.kafka_reader.concurrent_consumers}")
    public void consume(ConsumerRecord<Object, Object> record) {
        long start = System.currentTimeMillis();
        LOGGER.info("start consume Record from record:{}", record);
        LOGGER.info("start consume Record from topic:{}, with key:{}", record.topic(), record.key());
        try {
            TopicProcessor topicProcessor = new TopicProcessor();
            topicProcessor.setKey(record.key() != null ? record.key().toString() : null);
            topicProcessor.setTopic(record.topic());
            topicProcessor.setValue(record.value() != null ? record.value().toString() : null);

// removed this code to fix schema not found issue
            /*if (record.value() != null) {
                AvroToJsonStream avroToJsonStream = new AvroToJsonStream(schemaName, Integer.parseInt(schemaVersion), host, Integer.parseInt(port), httpProtocol, keytabLocation, userPrincipal);
                topicProcessor.setValue(avroToJsonStream.process((byte[]) record.value()));
            } else {
                topicProcessor.setValue(null);
            }*/
            LOGGER.info("record value :{}", topicProcessor.getValue());

            boolean sendToBroker = true;

            if (StringUtils.isNotEmpty(filterKey) && StringUtils.isNotEmpty(filterValue)) {
                LOGGER.info("filter is ON");
                sendToBroker = canSendToBroker(topicProcessor.getValue());
            }

            if (sendToBroker) {
                activeMq.sendMsg(fidQueue, mapper.writeValueAsString(topicProcessor));
                // activeMq.sendMsg(stagingQueue, mapper.writeValueAsString(ccr));
            }
        } catch (Exception e) {
            LOGGER.error("Error occurred while processing record from topic:{}, with key:{}", record.topic(), record.key(), e);
        }
        LOGGER.info("consumed Record from topic:{}, with key :{} completed in {} ms", record.topic(), record.key(), System.currentTimeMillis() - start);
    }

    private boolean canSendToBroker(String pValue) throws IOException {
        //JsonNode parent = new ObjectMapper().readTree(new File("src/test/resources/fid1.json"));
        JsonNode parent = new ObjectMapper().readTree(pValue);
        String[] tokens = filterKey.split(",");
        String value = null;
        for (String token : tokens) {
            parent = parent.path(token);
            parent = parent.path("eventOrigins");
            if (parent.isArray()) {
                for (JsonNode eventorigin : parent) {
                    value = eventorigin.path("eventOriginSourceSystemCode").asText();
                }
            }
        }
        if (filterValue.equals(value)) {
            return true;
        } else {
            LOGGER.info("value:{}, did not match the the filter", value);
            return false;
        }
    }

    @Override
    public void registerSeekCallback(ConsumerSeekCallback csc) {
        LOGGER.info("registerSeekCallback called");
    }

    @Override
    public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
        LOGGER.info("onPartitionsRevoked called");
    }
}
