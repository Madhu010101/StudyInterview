package org.example;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanConfig {

    @Value(value = "${spring.kafka.producer.topics}")
    private String topics;

    @Bean
    public KafkaAdmin kafkaAdmin() {

        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        return new KafkaAdmin(configs);
    }

    @Bean
    public ProducerFactory<String, String> producerFactory() {

        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

/*    @Bean
    public NewTopic topic1() {
        String[] split = topics.split(",");
        System.out.println(topics);
        return new NewTopic(split[0], 1, (short) 1);
    }

    @Bean
    public NewTopic topic2() {
        String[] split = topics.split(",");
        return new NewTopic(split[1], 1, (short) 1);
    }

    @Bean
    public NewTopic topic3() {
        String[] split = topics.split(",");
        return new NewTopic(split[2], 1, (short) 1);
    }

    @Bean
    public NewTopic topic4() {
        String[] split = topics.split(",");
        return new NewTopic(split[3], 1, (short) 1);
    }*/
}
