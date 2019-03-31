package Vehicle;

public class Vehicle {
    private int size;
    private int capacity;
    private int weight;
    private String means;
    private String fuel;
    private String engine;


    public Vehicle(){
        this(0,0,0,"Unknown", "Unknown", "Unknown");
    }

    public Vehicle(int size, int capacity, int weight, String means, String fuel, String engine) {
        this.size = size;
        this.capacity = capacity;
        this.weight = weight;
        this.means = means;
        this.fuel = fuel;
        this.engine = engine;
    }

    private void moving(){
        System.out.println("I'm moving this vehicle!!!");
    }

}
