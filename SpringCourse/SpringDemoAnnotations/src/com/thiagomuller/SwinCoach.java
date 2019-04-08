package com.thiagomuller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


public class SwinCoach implements Coach {
    @Autowired
    @Qualifier("sadFortuneService")
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Swin for 40 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getFileInfo(){
        return "Email: " + this.email + ", Team: " + this.team;
    }
}
