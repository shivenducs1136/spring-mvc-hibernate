package com.bitwisor.springcoredemo.common;

public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Play tennis for 15 minutes";
    }
}
