package com.fantastic4.timezone.controller;

import com.fantastic4.timezone.data.LocationTime;
import com.fantastic4.timezone.service.TimeCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Controller to manage all Time Zones
 */
@Controller
@RequestMapping(value="/zone")
public class TimeZoneController {

    TimeCalculatorService timeCalculatorService;

    @Autowired
    TimeZoneController(TimeCalculatorService timeCalculatorService){
        this.timeCalculatorService = timeCalculatorService;
    }

    /*
     * Redirect -> index page
     */
    @RequestMapping(value="/")
    public String timeZoneController(){
        return "Index";
    }

    /*
     * Calculate current time
     * Redirects -> current time page
     */
    @RequestMapping(value = "/time", params="action=currentTime")
    public String currentTime(ModelMap modelMap ) {
        modelMap.addAttribute("allTime", timeCalculatorService.getCurrentTime());
        return "Current Time";
    }

    /*
     * Redirects -> Prediction form
     */
    @RequestMapping(value="/time", params="action=predictTime")
    public String predictTimeForm(ModelMap modelMap){
        modelMap.addAttribute("locationTime", new LocationTime());
        return "PredictTimeForm";
    }

    /*
     * Calculate time for different zones
     * Redirects -> predicted Time page
     */
    @RequestMapping(value="/time/predict")
    public String PredictedTime(LocationTime locationTime, ModelMap modelMap){
        System.out.println("From Form: "+locationTime.getRajapalayam().toString());
        modelMap.addAttribute("message", "I'm in predicted!!!");
        return "PredictedTime";
    }

}
