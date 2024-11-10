package za.co.fnb.cish.fid.monitoring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.co.fnb.cish.fid.monitoring.util.AppProperties;

@Configuration
public class SchedulerConfigs {

    @Bean
    public AppProperties applicationProperties(){
        return new AppProperties();
    }
}
