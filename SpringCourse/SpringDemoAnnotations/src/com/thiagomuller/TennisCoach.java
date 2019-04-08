package com.thiagomuller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("fileRandomService")
    private FortuneService fortuneService;

    public TennisCoach(){}

    @Override
    public String getDailyWorkout() {
        return "Pratice your backhand volley for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("TennisCoach: doMyStartUpStuff");
    }

    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("TennisCoach: doMyCleanUpStuff");
    }
}
