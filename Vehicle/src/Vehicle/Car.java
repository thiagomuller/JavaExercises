package Vehicle;

public class Car extends Vehicle{

    private int wheels;
    private int ports;
    private int steeering;

    public Car(){
        this(0,0,0);
    }

    public Car(int size, int capaity, int weight){
        this(0 , 0 , 0 , "Road" , "Gas or alcohol" , "Road engine" , 1 , 1 , 1);
    }

    public Car(int size, int capacity, int weight, String means, String fuel, String engine, int wheels, int ports, int steeering) {
        super(size, capacity, weight, means, fuel, engine);
        this.wheels = wheels;
        this.ports = ports;
        this.steeering = steeering;
    }

    private void steering(){
        System.out.println("Im stirring a car!");
    }
}
