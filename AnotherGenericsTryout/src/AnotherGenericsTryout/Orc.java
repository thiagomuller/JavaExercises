package AnotherGenericsTryout;

public class Orc extends Humanoid implements HordeWarCry {
    private String clan;
    private String color;

    public Orc(String name, int age, String weapon, int hitPoints , int manaPoints, String profission) {
        super(name , age, weapon, hitPoints , manaPoints, profission);
    }

    public void forTheHorde(){
        System.out.println(getName() + " Says: " + "FOR THE HOOOOOOOOOOOOOORDE");
    }
}
