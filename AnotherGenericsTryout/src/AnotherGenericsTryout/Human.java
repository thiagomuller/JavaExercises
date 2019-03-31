package AnotherGenericsTryout;

public class Human extends Humanoid implements AllianceWarCry{
    private String alignment;


    public Human(String name, int age, String weapon, int hitPoints , int manaPoints, String profission) {
        super(name, age, weapon, hitPoints , manaPoints, profission);
    }

    public void forTheAlliance(){
        System.out.println(getName() + " says: " + "FOR THE ALLIAAAAAAAAAAAAAAANCE");
    }
}
