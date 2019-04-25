package com.thiagomuller;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Instant start = Instant.now();
        Calculator calculator = new Calculator("/home/thiago/Documents/JavaProjectsAndExercises/JavaExercises/solucaotecsinapse/recrutamento.csv", 12);
        Map<String, List<Double>> resultingList = calculator.getItemWithGreaterQty();
        System.out.println(resultingList);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed + " milliseconds");

        //This code for the given tecsinapse file is running within 15 milliseconds
        //I've tested it with one file that has more than one million lines, it took 1077 milliseconds to complete

    }
}
