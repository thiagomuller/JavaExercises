package com.thiagomuller;

import java.util.concurrent.Callable;

public class Mult implements Callable<Integer> {
    private int num = 10;
    private Numbers numbers;

    public Mult(Numbers numbers) {
        this.numbers = numbers;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        System.out.println("Thread: " + Thread.currentThread() + " running");
        return numbers.mult(this.num);
    }
}
