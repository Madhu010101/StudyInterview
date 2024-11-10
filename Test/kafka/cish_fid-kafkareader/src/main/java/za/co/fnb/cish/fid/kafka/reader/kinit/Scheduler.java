/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.fnb.cish.fid.kafka.reader.kinit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

/**
 *
 * @author f2865912
 */
@Component
@Scope("singleton")
public class Scheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scheduler.class);
    public static final String LOCAL_DEV = "local-dev";
    private final ExecuteLinuxCommand commandLine;

    @Value(value = "${spring.profiles.active}")
    private String environment;
    @Value(value = "${spring.kinit.keyTabPath}")
    private String keyTabPath;
    @Value(value = "${spring.kinit.principal}")
    private String principal;

    private String command;

    public Scheduler() {
        this.commandLine = new ExecuteLinuxCommand();
    }
    
    @PostConstruct
    public void sendStartUpMsg() {
        if(!LOCAL_DEV.equals(environment)) {
            LOGGER.info("Initiate the KeyTab @PostConstruct");
            command = String.format("kinit -kt %s %s",  keyTabPath, principal);
            LOGGER.info(commandLine.executeCommand(command));
        }
    }
    
    // Runs every 8 hours
    @Scheduled(cron = "0 0 0/8 * * *")
    public void initKeyTab() {
        if(!LOCAL_DEV.equals(environment)) {
            LOGGER.info("Initiate the KeyTab : @EveryEightHours");
            LOGGER.info(commandLine.executeCommand(command));
            LOGGER.info("Initiate the KeyTab : @EveryEightHours : Sleeping");
        }
    }
}
