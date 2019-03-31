package CompositionFirstFly;

public class Motherboard {
    public String ramCapacity;
    private String ramSlots;

    public Motherboard(String ramCapacity, String ramSlots) {
        this.ramCapacity = ramCapacity;
        this.ramSlots = ramSlots;
    }

    public String getRamCapacity() {
        return ramCapacity;
    }

    public String getRamSlots() {
        return ramSlots;
    }
}
