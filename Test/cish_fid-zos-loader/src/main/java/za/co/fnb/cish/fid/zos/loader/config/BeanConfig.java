package za.co.fnb.cish.fid.zos.loader.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;
import za.co.fnb.cish.fid.zos.loader.controller.CustomizedResponseEntityExceptionHandler;
import za.co.fnb.cish.fid.zos.loader.zos.client.ZosServiceClient;

import jakarta.annotation.PostConstruct;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class BeanConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomizedResponseEntityExceptionHandler.class);
    @Value(value = "${Fid.resend.maxPoolSize}")
    private int resendMaxPoolSize;
    @Value(value = "${Fid.resend.queueCapacity}")
    private int resendQueueCapacity;

    @Value(value = "${Fid.execution.maxPoolSize}")
    private int maxPoolSize;

    @Autowired
    private Environment env;

    @Bean
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }


    @Bean
    public ZosServiceClient createZosService() {
        return new ZosServiceClient();
    }

    @PostConstruct
    private void configureSSL() {
        if (Objects.nonNull(env.getProperty("server.ssl.enabled"))
                && "true".equals(env.getProperty("server.ssl.enabled"))) {
            System.setProperty("jakarta.net.ssl.keyStore", env.getProperty("server.ssl.key-store"));
            System.setProperty("jakarta.net.ssl.keyStorePassword", env.getProperty("server.ssl.key-store-password"));
            System.setProperty("jakarta.net.ssl.keyStoreType", env.getProperty("server.ssl.key-store-type"));
            LOGGER.info("SSL for ZosConnect enabled.");
        }
    }

    @Bean(name = "FidLoaderTask")
    @Primary
    public Executor resendTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setMaxPoolSize(maxPoolSize);
        executor.setCorePoolSize(resendMaxPoolSize);
        executor.setQueueCapacity(resendQueueCapacity);
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }

    @Bean(name = "RegulatoryFidLoaderTask")
    public Executor resendTaskExecutorReg() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setMaxPoolSize(maxPoolSize);
        executor.setCorePoolSize(resendMaxPoolSize);
        executor.setQueueCapacity(resendQueueCapacity);
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
}
