package com.thiagomuller;

public class ConsolidatedOrder {
    private String item;
    private double quantity;
    private double price;

    public ConsolidatedOrder(String item, double quantity, double price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return item + "#" + price;
    }
}
