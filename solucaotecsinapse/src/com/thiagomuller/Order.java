package com.thiagomuller;

public class Order {
    private String item;
    private double quantity;
    private double price;

    public Order(String item, double quantity, double price) {
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
}
