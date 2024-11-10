package za.co.fnb.cish.fid.zos.loader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@SpringBootApplication
@EnableJpaRepositories(basePackages = "za.co.fnb.cish.fid.repo")
@EntityScan(basePackages = {"za.co.fnb.cish.fid.repo.model"})
@EnableScheduling
public class ZosLoaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZosLoaderApplication.class, args);
    }

}
