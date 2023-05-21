package com.bitwisor.springcoredemo.common;

public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In construction: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Play tennis for 15 minutes";
    }
}
