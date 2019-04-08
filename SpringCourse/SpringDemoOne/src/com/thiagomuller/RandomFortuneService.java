package com.thiagomuller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private List<String> fortuneList = new ArrayList<>();


    @Override
    public String getFortune() {
        fortuneList.add("Today is your lucky day!");
        fortuneList.add("Never give up, you're gonna make it!");
        fortuneList.add("Learning Java and Spring is cool!");
        Random random = new Random();
        int n = random.nextInt(3);
        return fortuneList.get(n);
    }
}
