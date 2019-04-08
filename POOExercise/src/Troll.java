public class Troll implements GetInfo{
    private String name;
    private String weapon;


    public Troll(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    @Override
    public void sayMyName() {
        System.out.println("My name is: " + this.name);
    }
}
