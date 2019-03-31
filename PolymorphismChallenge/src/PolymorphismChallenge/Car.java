package PolymorphismChallenge;

public class Car {
    private String name;
    private int cylinders;
    private int wheels = 4;
    private boolean engine = true;
    private int speed = 0;
    private int gear = 0;
    private int maximumSpeed;

    public Car(String name, int cylinders, int maximumSpeed) {
        this.name = name;
        this.cylinders = cylinders;
        this.maximumSpeed = maximumSpeed;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void startEngine(){
        System.out.println("Car's power on!");
    }

    public void acelerate(int desiredSpeed){
        System.out.println("Starting to acelerate. \n");
        while(speed <= desiredSpeed){
            speed += cylinders / 10;
            if(speed%50 == 0 ){
                gear += 1;
                System.out.println("Switching gears");
                System.out.println(String.format("Current speed %s, and current gear %d", speed, gear));
            }
        }
        System.out.println("I've reached desired speed, mantaining constant speed now");
    }

    public void brake(){
        while(speed >= 0){
            speed --;
            if(speed%50 == 0 ){
                gear += 1;
                System.out.println("Switching gears");
                System.out.println(String.format("Current speed %s, and current gear %d", speed, gear));
            }
        }
    }


}
