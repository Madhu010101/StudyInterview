package za.co.fnb.idna;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfluentKafkaAvroSerializer extends KafkaAvroSerializer {

    private static final Logger LOG = LoggerFactory.getLogger(ConfluentKafkaAvroSerializer.class);

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        try (InputStream input = new FileInputStream("/deployments/etc/properties.cfg")) {
            Map<String,Object> customConfigs = new HashMap<>(configs);
            Properties prop = new Properties();
            prop.load(input);


            LOG.info("schema.reg.url >> : " + prop.getProperty("schema.reg.url"));
            LOG.info("source.credentials >> : " + prop.getProperty("source.credentials"));
            LOG.info("truststore.location >> : " + prop.getProperty("truststore.location"));

            customConfigs.put("schema.registry.url",prop.getProperty("schema.reg.url"));
            customConfigs.put("basic.auth.credentials.source", "USER_INFO");
            customConfigs.put("schema.registry.basic.auth.user.info",prop.getProperty("source.credentials"));
            customConfigs.put("schema.registry.ssl.truststore.location",prop.getProperty("truststore.location"));
            customConfigs.put("schema.registry.ssl.truststore.password",prop.getProperty("truststore.password"));
            customConfigs.put("auto.register.schemas","false");
            customConfigs.put("use.latest.version","true");
          //  customConfigs.put("avro.remove.java.properties","true");
            super.configure(customConfigs, isKey);
        } catch(Exception e) {
            LOG.info("****************ERROR SERILIAZER***********");
            LOG.info("Error : " + e.getStackTrace());
        }
    }
}
