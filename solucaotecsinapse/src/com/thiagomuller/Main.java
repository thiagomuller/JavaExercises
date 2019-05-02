package com.thiagomuller;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Instant start = Instant.now();
        CsvOrderParser csvOrderParser = new CsvOrderParser();
        List<Order> listOfValidatedOrdersPerMonth =
                csvOrderParser.mapCSVFileToOrderList("/home/thiago/Documents/JavaProjectAndExercises/JavaExercises/solucaotecsinapse/recrutamento.csv", 12);
        Consolidator consolidator = new Consolidator();
        List<ConsolidatedOrder> consolidatedOrders = consolidator.aggregateAndSumOrdersByItem(listOfValidatedOrdersPerMonth);
        Calculator calculator = new Calculator();
        ConsolidatedOrder finalResult = calculator.getItemWithGreaterQty(consolidatedOrders);
        Instant finish = Instant.now();
        TecsinapseSender tec = new TecsinapseSender();
        tec.sendResultToTecsinapse("https://eventsync.portaltecsinapse.com.br/public/recrutamento/finalizar?email=mullerthiago8@gmail.com", finalResult);
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed + " milliseconds");


        //This code for the given tecsinapse file is running within 20 milliseconds WITHOUT the http post request
        //I've tested it with one file that has more than one million lines, it took 1032 milliseconds to complete

    }
}
