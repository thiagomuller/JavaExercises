public class Orc implements GetInfo{
    private String name;
    private String weapon;

    public Orc(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void roar(){
        System.out.println("FOR THE HOOOOOOOOOORDE");
    }

    @Override
    public void sayMyName() {
        System.out.println("My name is: " + this.name + ", FOR THE HORDE!");
    }
}
