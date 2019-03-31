package PolymorphismChallenge;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Generic Car" , 300 , 500);
        Celta celta = new Celta();
        Camaro camaro = new Camaro();

        car.acelerate(300);
        celta.acelerate(200);
        camaro.acelerate(300);


    }
}
