package com.bitwisor.springcoredemo.rest;

import com.bitwisor.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency

    private Coach myCoach;

    // define a settor for dependency injection
    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }
//    @Autowired
//    public void dosomeStuff(Coach myCoach){
//        this.myCoach = myCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
