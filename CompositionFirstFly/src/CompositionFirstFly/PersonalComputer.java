package CompositionFirstFly;

public class PersonalComputer {
    public Motherboard motherboard;
    private String vendor;
    private Processor processor;

    public PersonalComputer(Motherboard motherboard, String vendor, Processor processor) {
        this.motherboard = motherboard;
        this.vendor = vendor;
        this.processor = processor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
