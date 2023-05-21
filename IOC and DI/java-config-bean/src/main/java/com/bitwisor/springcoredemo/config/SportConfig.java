package com.bitwisor.springcoredemo.config;

import com.bitwisor.springcoredemo.common.Coach;
import com.bitwisor.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach myNewSportConfig(){
        return new SwimCoach();
    }

}
