package com.thiagomuller;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Pratice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside the setter method - setFortuneSerivce");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
