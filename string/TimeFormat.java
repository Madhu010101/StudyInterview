package com.in28minutes.java.string;

import org.apache.commons.lang3.time.DurationFormatUtils;

import java.time.Duration;

public class TimeFormat {

     public static void main(String[] args) {
         TimeFormat timeFormat = new TimeFormat();

        int time = 600;
         String timeInHHMMSS = DurationFormatUtils.formatDuration(38114000, "HH:MM:SS", true);
         Duration duration = Duration.ofMillis(0561);
         System.out.println("duration: "+ duration.toHoursPart()+":"+duration.toMinutesPart() +":"+duration.toSecondsPart());// 8

         String timeInHHMMSS1 = String.format("%02d:%02d:%02d", duration.toHours(), duration.toMinutes(), duration.toSeconds());
         System.out.println("timeInHHMMSS: "+ timeInHHMMSS);// 8

    }
}
