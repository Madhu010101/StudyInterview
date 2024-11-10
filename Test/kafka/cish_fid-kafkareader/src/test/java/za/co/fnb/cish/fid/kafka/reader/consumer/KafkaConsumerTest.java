package za.co.fnb.cish.fid.kafka.reader.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import za.co.fnb.cish.fid.kafka.reader.jms.ProduceActiveMq;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaConsumerTest {

    @Autowired
    private KafkaConsumer kafkaConsumer;

    @MockBean
    private ProduceActiveMq activeMq;

    @Test
    public void testConsume() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        File file = new File("src/test/resources/fid.json");
        byte[] bytes = Files.readAllBytes(file.toPath());
        String message = new String(bytes, StandardCharsets.UTF_8);
        TopicProcessor topicProcessor = mapper.readValue(message, TopicProcessor.class);

        ConsumerRecord<Object, Object> record = new ConsumerRecord<>(topicProcessor.getTopic(), 0, 1, topicProcessor.getKey(), topicProcessor.getValue());
        kafkaConsumer.consume(record);

        TopicProcessor ccr = getRecord(record);
        Mockito.verify(activeMq).sendMsg(topicProcessor.getTopic(), mapper.writeValueAsString(ccr));
    }

    private TopicProcessor getRecord(ConsumerRecord<Object, Object> record) {
        TopicProcessor topicProcessor = new TopicProcessor();

        topicProcessor.setValue(record.value() == null ? null : record.value().toString());
        return topicProcessor;
    }
}
