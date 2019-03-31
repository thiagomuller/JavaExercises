package PolymorphismChallenge;

public class Camaro extends Car{
    public Camaro() {
        super("Camaro", 200, 300);
    }

    @Override
    public void acelerate(int desiredSpeed) {
        super.acelerate(desiredSpeed);
        System.out.println("I'm overriding car acelerate, meaning that there's polymorphism going on about here! I'm Camaro");
    }
}
