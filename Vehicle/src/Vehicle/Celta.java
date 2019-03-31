package Vehicle;

public class Celta extends Car{
    private int company;
    private int flex;
    private double power;

    public Celta(int size, int capaity, int weight, int company, int flex, double power) {
        super(size, capaity, weight);
        this.company = company;
        this.flex = flex;
        this.power = power;
    }

    private void changeGears(){
        System.out.println("I can change gears, since they're chevrolet's");
    }
}
