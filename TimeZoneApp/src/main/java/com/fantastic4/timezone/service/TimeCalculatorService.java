package com.fantastic4.timezone.service;

import com.fantastic4.timezone.data.LocationTime;
import com.fantastic4.timezone.data.ZonedLocationTime;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public String calculate(LocationTime locationTime){

//        for (Map.Entry<String, LocalDateTime> entry : predictionFormData.entrySet()) {
//            if(entry!=null){
//                enteredZone = entry.getKey();
//            }
//        }

        ObjectMapper mapper = new ObjectMapper();

        // Convert POJO to Map
        Map<String, Object> map =
                mapper.convertValue(locationTime, new TypeReference<Map<String, Object>>() {});


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
