package za.co.fnb.cish.fid.kafka.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FidKafkaReaderApplication {

    public static void main(String[] args) {

        SpringApplication.run(FidKafkaReaderApplication.class, args);
    }
}
