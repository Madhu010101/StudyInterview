package com.virtualpairprogrammers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableScheduling
public class FleetmanApplication {
	public static void main(String[] args) {
		SpringApplication.run(FleetmanApplication.class, args);
	}	
}

/*
@SpringBootApplication

@EntityScan(basePackages={"com.virtualpairprogrammers.data"})
@ComponentScan(basePackages={"com.*"})
public class FleetmanApplication {
	public static void main(String[] args) {
		SpringApplication.run(FleetmanApplication.class, args);
	}
}*/
