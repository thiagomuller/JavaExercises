package PolymorphismChallenge;

public class Celta extends Car {
    public Celta() {
        super("Celta", 100, 200);
    }

    @Override
    public void acelerate(int desiredSpeed) {
        super.acelerate(desiredSpeed);
        System.out.println("I'm overriding car acelerate, meaning that there's polymorphism going on about here! I'm Celta");
    }
}
