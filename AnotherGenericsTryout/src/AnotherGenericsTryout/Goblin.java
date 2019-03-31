package AnotherGenericsTryout;

public class Goblin extends Humanoid implements HordeWarCry{
    private String color;

    public Goblin(String name, int age, String weapon, String color, int hitPoints , int manaPoints, String profission) {
        super(name, age, weapon, hitPoints , manaPoints, profission);
        this.color = color;
    }

    public void forTheHorde(){
        System.out.println(getName() + " says: " + "FOR THE HOOOOOOOOOOOOOOOORDE!!!!!");
    }
}
