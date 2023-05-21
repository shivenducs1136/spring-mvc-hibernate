package com.bitwisor.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In construction: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Please workout for 15 minutes!!!!";
    }
}
