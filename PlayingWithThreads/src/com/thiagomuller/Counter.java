package com.thiagomuller;

public class Counter {
    private int counter;

    public Counter(int counter) {
        this.counter = counter;
    }

    public synchronized void counterIncrementation(String threadName){
        for(int i =0; i <= 100; i ++){
            counter ++;
            System.out.println("I'm thread: " + threadName + " and I'm incrementing counter, current counter value is: " + counter);
        }
    }

    public synchronized void counterDecrementation(String threadName){
        for(int i =0; i <= 100; i ++){
            counter --;
            System.out.println("I'm thread: " + threadName + " and I'm decrementing counter, current counter value is: " + counter);
        }
    }
}
