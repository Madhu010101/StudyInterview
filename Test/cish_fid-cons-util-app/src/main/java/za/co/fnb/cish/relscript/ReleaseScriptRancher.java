package za.co.fnb.cish.relscript;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"za.co.fnb.cish.relscript"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ReleaseScriptRancher {
    public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ReleaseScriptRancher.class, args);
        //ctx.close();
    }

}

