package com.thiagomuller;

public class MakerThread implements Runnable{
    private AlecrimTea alecrimTea;

    public MakerThread(AlecrimTea alecrimTea) {
        this.alecrimTea = alecrimTea;
    }

    @Override
    public void run() {
        alecrimTea.makeTea();
    }
}
