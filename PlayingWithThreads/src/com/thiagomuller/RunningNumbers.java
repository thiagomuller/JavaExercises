package com.thiagomuller;

public class RunningNumbers implements Runnable {
    private Counter counter;
    private int mode;

    public RunningNumbers(Counter counter, int mode) {
        this.counter = counter;
        this.mode = mode;
    }

    @Override
    public void run() {
        if (0 == mode) {
            this.counter.counterIncrementation(Thread.currentThread().getName());
        } else if (1 == mode) {
            this.counter.counterDecrementation(Thread.currentThread().getName());
        }

    }

}