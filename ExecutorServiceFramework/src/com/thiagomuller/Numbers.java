package com.thiagomuller;

public class Numbers{
    private int number;

    public Numbers(int number) {
        this.number = number;
    }

    public int sum(int num){
        return this.number + num;
    }

    public int mult(int num){
        return this.number * num;
    }

    public int sub(int num){
        return this.number - num;
    }

    public int div(int num){
        return this.number / num;
    }
}
