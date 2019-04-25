package com.thiagomuller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {
    private Consolidator consolidator;
    private Map<String, List<Double>> finalResult;
    private String previousKey;


    public Calculator(String csvFile, int desiredMonth) {
        this.consolidator = new Consolidator(csvFile, desiredMonth);
        this.finalResult = new HashMap<>();
        this.previousKey = "";
    }


    public Map<String, List<Double>> getItemWithGreaterQty(){
        Map<String, List<Double>> consolidatedItems = consolidator.getConsolidatedItems();
        for(String key : consolidatedItems.keySet()){
            isFinalResultEmpty(consolidatedItems, key);
            double previousQty = finalResult.get(previousKey).get(0);
            double previousPrice = finalResult.get(previousKey).get(1);
            isCurrentQtyGreaterThanPreviousQty(consolidatedItems, key, previousQty);
        }

        return finalResult;
    }

    public void isFinalResultEmpty(Map<String, List<Double>> consolidatedItems, String key){
        if(finalResult.isEmpty()){
            finalResult.put(key , consolidatedItems.get(key));
            previousKey = key;

        }
    }

    public void isCurrentQtyGreaterThanPreviousQty(Map<String, List<Double>> consolidatedItems, String key, double previousQty){
        if(consolidatedItems.get(key).get(0) > previousQty){
            finalResult.remove(previousKey);
            finalResult.put(key, consolidatedItems.get(key));
            previousKey = key;
        }
    }
}
