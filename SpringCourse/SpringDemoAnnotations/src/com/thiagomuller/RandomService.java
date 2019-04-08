package com.thiagomuller;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomService implements FortuneService {
    @Override
    public String getFortune() {
        List<String> fortuneList = new ArrayList<>();
        fortuneList.add("Keep going foward, you're gonna make it someday!");
        fortuneList.add("Learning to code is hard, but is cool");
        fortuneList.add("Today is your lucky day");
        Random rand = new Random();
        return fortuneList.get(rand.nextInt(3));
    }
}
