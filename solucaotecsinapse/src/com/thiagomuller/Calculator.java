package com.thiagomuller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {

    public ConsolidatedOrder getItemWithGreaterQty(List<ConsolidatedOrder> consolidatedOrders){
        double previousQty = 0.0;
        int greatestQtyIndex = 0;
        for(int i=0; i < consolidatedOrders.size(); i ++){
            if(consolidatedOrders.get(i).getQuantity() > previousQty){
                previousQty = consolidatedOrders.get(i).getQuantity();
                greatestQtyIndex = i;
            }
        }
        return consolidatedOrders.get(greatestQtyIndex);
    }
}
