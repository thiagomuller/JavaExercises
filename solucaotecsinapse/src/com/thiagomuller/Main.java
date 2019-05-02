package com.thiagomuller;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Instant start = Instant.now();
        Calculator calculator = new Calculator("/home/thiago/Documents/JavaProjectAndExercises/JavaExercises/solucaotecsinapse/recrutamento.csv", 12);
        Map<String, List<Double>> finalResult = calculator.getItemWithGreaterQty();
        System.out.println(finalResult);
        HttpHandler httpHandler = new HttpHandler(
                "https://eventsync.portaltecsinapse.com.br/public/recrutamento/finalizar?email=mullerthiago8@gmail.com",
                finalResult);
        httpHandler.sendPostRequestToTecsinapse();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed + " milliseconds");


        //This code for the given tecsinapse file is running within 20 milliseconds WITHOUT the http post request
        //I've tested it with one file that has more than one million lines, it took 1032 milliseconds to complete

    }
}
