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
    private Coach anotherCoach;
    @Autowired
    DemoController(@Qualifier("baseBallCoach") Coach theCoach,@Qualifier("baseBallCoach") Coach theAnotherCoach){
        System.out.println("In construction: "+ getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }
    // define a settor for dependency injection

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach : " + (myCoach == anotherCoach);
    }
}
