package com.thiagomuller;

import java.util.*;

public class Consolidator {
    private CsvOrderParser orderParser;
    private List<Order> listOfValidatedPerMonthOrders;
    private Map<String, List<Double>> consolidatedItems;


    public Consolidator(String csvFile, int desiredMonth){
        this.orderParser = new CsvOrderParser(csvFile, desiredMonth);
        this.listOfValidatedPerMonthOrders = orderParser.mapCSVFileToOrderList();
        this.consolidatedItems = new HashMap<>();
    }


    public void aggregateAndSumOrdersForItem(){
        //I decided to use this pure version of for loop here because he is way more performative
        // than forEach or enhanced for loops!
        for(int i = 0; i < listOfValidatedPerMonthOrders.size(); i ++){
            String item = listOfValidatedPerMonthOrders.get(i).getItem();
            double quantity = listOfValidatedPerMonthOrders.get(i).getQuantity();
            double price = listOfValidatedPerMonthOrders.get(i).getPrice();
            addOrUpdateToConsolidatedItems(item, quantity, price);
        }
    }

    public void addOrUpdateToConsolidatedItems(String currentItem, double currentQty, double currentPrice){
        if(!consolidatedItems.containsKey(currentItem)){
            consolidatedItems.put(currentItem, Arrays.asList(currentQty, currentPrice));
        } else{
            updateAndReplaceToConsolidatedItems(currentItem, currentQty, currentPrice);
        }
    }

    public void updateAndReplaceToConsolidatedItems(String currentItem, double currentQty, double currentPrice){
        double updatedQty = consolidatedItems.get(currentItem).get(0) + currentQty;
        double updatedPrice = (double) Math.round((consolidatedItems.get(currentItem).get(1) + currentPrice) * 100) / 100;
        consolidatedItems.replace(currentItem, Arrays.asList(updatedQty, updatedPrice));
    }

    public Map<String, List<Double>> getConsolidatedItems(){
        aggregateAndSumOrdersForItem();
        return consolidatedItems;
    }

}
