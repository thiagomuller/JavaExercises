package com.thiagomuller;

public class Main {
    public static void main(String[] args) {
        Drop drop = new Drop();
        Thread consumer = new Thread(new Consumer(drop));
        Thread producer = new Thread(new Producer(drop));

        consumer.start();
        producer.start();
    }
}
