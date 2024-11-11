package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

@Component
public class Scheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scheduler.class);

    private final ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Value(value = "${spring.kafka.producer.topics}")
    private String topic;

    // Runs every 5 seconds
    @Scheduled(cron = "*/200 * * * * *")
    @PostConstruct
    public void sendMessageToTopic() {
        LOGGER.info("Sending message to {}", "fid");
        try {
            File file = new File("C:/Projects/CustomerCache/source/Kafka/kafka_simulator/src/main/resources/RM.json");
           // File file = new File("src/main/resources/s0024301.json");
            LOGGER.info("path:{}",file.getAbsolutePath());
            byte[] bytes = Files.readAllBytes(file.toPath());

            String message = new String(bytes, StandardCharsets.UTF_8);

            CdcCisRecord cdcCisRecord = mapper.readValue(message, CdcCisRecord.class);

            for (int i = 0; i < 10; i++) {
                kafkaTemplate.send(cdcCisRecord.getTopic(), cdcCisRecord.getKey(), cdcCisRecord.getValue());
            }
        } catch (IOException e) {
            LOGGER.error("Something terrible happened", e);
        }
        LOGGER.info("done sending message");

    }
}
