package com.thiagomuller;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        Thread firstThread = new Thread(new RunningNumbers(counter , 0));
        Thread secondThread = new Thread(new RunningNumbers(counter , 1));

        firstThread.start();
        secondThread.start();
    }
}
