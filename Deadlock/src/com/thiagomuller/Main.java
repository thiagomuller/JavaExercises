package com.thiagomuller;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new Deadlock());
        Thread secondThread = new Thread(new Deadlock());

        firstThread.start();
        secondThread.start();
    }
}
