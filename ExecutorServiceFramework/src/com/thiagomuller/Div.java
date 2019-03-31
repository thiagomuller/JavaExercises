package com.thiagomuller;

import java.util.concurrent.Callable;

public class Div implements Callable<Integer> {
    private int num = 10;
    private Numbers numbers;

    public Div(Numbers numbers) {
        this.numbers = numbers;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Thread: " + Thread.currentThread() + " running");
        return numbers.div(this.num);
    }
}
