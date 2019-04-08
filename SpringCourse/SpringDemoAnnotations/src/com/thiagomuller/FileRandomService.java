package com.thiagomuller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileRandomService implements FortuneService{
    private List<String> fortuneList = new ArrayList<>();

    @Value("${firstFortune}")
    String firstFortune;

    @Value("${secondFortune}")
    String secondFortune;

    @Value("${thirdFortune}")
    String thirdFortune;

    public void populateList(){
        this.fortuneList.add(0, this.firstFortune);
        this.fortuneList.add(1, this.secondFortune);
        this.fortuneList.add(2, this.thirdFortune);
    }

    @Override
    public String getFortune() {
        populateList();
        Random random = new Random();
        return fortuneList.get(random.nextInt(3));
    }
}
