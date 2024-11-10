package za.co.fnb.idna;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("za.co.fnb.idna")
@ImportResource({"classpath:spring/camel-context.xml"})
public class KafkaToKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaToKafkaApplication.class, args);
    }

}
