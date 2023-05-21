package com.bitwisor.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In construction: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Please do track for 15 minutes";
    }
}
