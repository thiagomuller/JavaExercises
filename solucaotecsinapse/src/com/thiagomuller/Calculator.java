package com.thiagomuller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {
    private Consolidator consolidator;
    private Map<String, List<Double>> finalResult;


    public Calculator(String csvFile, int desiredMonth) {
        this.consolidator = new Consolidator(csvFile, desiredMonth);
        this.finalResult = new HashMap<>();
    }


    public Map<String, List<Double>> getItemWithGreaterQty(){
        String previousKey = "";
        double previousQty = 0.0;
        Map<String, List<Double>> consolidatedItems = consolidator.getConsolidatedItems();
        for(String key : consolidatedItems.keySet()){
            inputFirstValueToFinalResultIfEmpty(consolidatedItems, key);
            if(!previousKey.equals("")){
                previousQty = finalResult.get(previousKey).get(0);
                if(isCurrentQtyGreaterThanPreviousQty(consolidatedItems, key, previousKey, previousQty)){
                    previousKey = key;
                }
            }
            if(previousKey.equals("")) {
                previousKey = key;
            }
        }
        return finalResult;
    }

    public void inputFirstValueToFinalResultIfEmpty(Map<String, List<Double>> consolidatedItems, String key){
        if(finalResult.isEmpty()){
            finalResult.put(key , consolidatedItems.get(key));
        }
    }

    public boolean isCurrentQtyGreaterThanPreviousQty(Map<String, List<Double>> consolidatedItems, String key, String previousKey, double previousQty){
        if(consolidatedItems.get(key).get(0) > previousQty){
            finalResult.remove(previousKey);
            finalResult.put(key, consolidatedItems.get(key));
            return true;
        }
        return false;
    }
}
