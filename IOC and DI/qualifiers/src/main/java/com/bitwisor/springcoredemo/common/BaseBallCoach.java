package com.bitwisor.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Play baseBall for 15 minutes";
    }
}
