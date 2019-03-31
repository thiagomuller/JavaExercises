package com.thiagomuller;

public class DrinkerThread implements Runnable{
    private AlecrimTea alecrimTea;

    public DrinkerThread(AlecrimTea alecrimTea) {
        this.alecrimTea = alecrimTea;
    }

    @Override
    public void run() {
        alecrimTea.drinkTea();
    }
}
