package com.fantastic4.timezone.service;

import com.fantastic4.timezone.data.ZonedLocationTime;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

/*
 * Service class to perform all time calculations
 */
@Service
public class TimeCalculatorService {

    private String enteredZone;

    /*
     * Calculate current time of all 4 zones
     */
    public ZonedLocationTime getCurrentTime(){
        ZonedLocationTime allTime = ZonedLocationTime.builder()
                .rajapalayam(getTime("Asia/Kolkata"))
                .dubai(getTime("Asia/Dubai"))
                .london(getTime("Europe/London"))
                .sanAntonio(getTime("America/Chicago"))
                .build();

        return allTime;
    }

    /*
     * Calculate time for different zone from the input time zone
     */
    public Map<String, LocalDateTime> calculate(Map<String, LocalDateTime> predictionFormData){

        for (Map.Entry<String, LocalDateTime> entry : predictionFormData.entrySet()) {
            if(entry!=null){
                enteredZone = entry.getKey();
            }
        }

        return null;
    }

    /*
     * Calculate current time for particular location
     */
    public ZonedDateTime getTime(String location){
        ZoneId id = ZoneId.of(location);
        return ZonedDateTime.now(id);
    }

}
