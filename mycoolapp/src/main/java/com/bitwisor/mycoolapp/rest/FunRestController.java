package com.bitwisor.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team Name: " +teamName;
    }

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping("/nam")
    public String sayName(){
        return "Shivendu Mishra";
    }

}
