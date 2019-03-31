package Capuccino;

public class Coffe {

    // Just praticing inheritance concepts, the data types doesn't really matter now, so I'm using 1 for present and 0 for not present.

    private int milk;
    private int coffePowder;
    private int sugar;

    public Coffe(){
        this(1, 1, 1);
    }

    public Coffe(int milk, int coffePowder , int sugar){
        this.milk = milk;
        this.coffePowder = coffePowder;
        this.sugar = sugar;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffePowder() {
        return coffePowder;
    }

    public int getSugar() {
        return sugar;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCoffePowder(int coffePowder) {
        this.coffePowder = coffePowder;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void isCoffeGood(){
        System.out.println("Yes, coffe is amazing!\n");
    }
}
