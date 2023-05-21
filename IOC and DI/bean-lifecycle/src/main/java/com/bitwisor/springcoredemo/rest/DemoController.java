package com.bitwisor.springcoredemo.rest;

import com.bitwisor.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency

    private Coach myCoach;
    @Autowired
    DemoController(@Qualifier("cricketCoach") Coach theCoach){
        System.out.println("In construction: "+ getClass().getSimpleName());
        myCoach = theCoach;
    }
    // define a settor for dependency injection

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
