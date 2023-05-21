package com.bitwisor.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseBallCoach implements Coach{

    public BaseBallCoach(){
        System.out.println("In construction: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Play baseBall for 15 minutes";
    }
}
