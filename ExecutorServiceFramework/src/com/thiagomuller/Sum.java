package com.thiagomuller;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    private Numbers numbers;
    private int num = 10;

    public Sum(Numbers numbers) {
        this.numbers = numbers;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Thread: " + Thread.currentThread() + " running");
        return numbers.sum(this.num);
    }
}
