package com.thiagomuller;

public class Main {
    public static void main(String[] args) {
        AlecrimTea alecrimTea = new AlecrimTea(true);
        Thread teaMaker = new Thread(new MakerThread(alecrimTea));
        Thread teaDrinker = new Thread(new DrinkerThread(alecrimTea));

        teaMaker.start();
        teaDrinker.start();
    }
}
