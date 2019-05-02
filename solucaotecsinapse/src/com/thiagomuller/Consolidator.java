package com.thiagomuller;

import java.util.*;

public class Consolidator {

    public List<ConsolidatedOrder> aggregateAndSumOrdersByItem(List<Order> listOfValidatedOrdersPerMonth){
        List<ConsolidatedOrder> consolidatedOrders = new ArrayList<>();
        Map<String,ConsolidatedOrder> accumulatedItens = new HashMap<>();
        //I decided to use this pure version of for loop here because he is way more performative
        // than forEach or enhanced for loops!
        for(int i = 0; i < listOfValidatedOrdersPerMonth.size(); i ++){
            String item = listOfValidatedOrdersPerMonth.get(i).getItem();
            double quantity = listOfValidatedOrdersPerMonth.get(i).getQuantity();
            double price = listOfValidatedOrdersPerMonth.get(i).getPrice();
            ConsolidatedOrder consolidatedOrder = new ConsolidatedOrder(item, quantity, price);
            if(!accumulatedItens.containsKey(consolidatedOrder.getItem())){
                accumulatedItens.put(consolidatedOrder.getItem(), consolidatedOrder);
            } else{
                updateItemInPossibleItems(accumulatedItens, consolidatedOrder, quantity, price);
            }
        }
        consolidatedOrders.addAll(accumulatedItens.values());
        return consolidatedOrders;
    }

    public void updateItemInPossibleItems(Map<String, ConsolidatedOrder> possibleItems, ConsolidatedOrder consolidatedOrder, double quantity, double price){
        double updatedQty = possibleItems.get(consolidatedOrder.getItem()).getQuantity() + quantity;
        double updatedPrice = (double) Math.round((possibleItems.get(consolidatedOrder.getItem()).getPrice() + price) * 100) / 100;
        consolidatedOrder.setQuantity(updatedQty);
        consolidatedOrder.setPrice(updatedPrice);
        possibleItems.replace(consolidatedOrder.getItem(), consolidatedOrder);

    }


}
