package za.co.fnb.cish.fid.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJms
@EnableAsync
@EnableScheduling
@EnableJpaRepositories(basePackages = "za.co.fnb.cish.fid.repo.repository.*")
@EntityScan(basePackages = {"za.co.fnb.cish.fid.repo.model.*"})
@SpringBootApplication
/*@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})*/
public class FidMonitoringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FidMonitoringApplication.class, args);
    }
}
