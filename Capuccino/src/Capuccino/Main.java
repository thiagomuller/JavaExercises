package Capuccino;

public class Main {

    public static void main(String[] args){
        Coffe coffe = new Coffe();
        Capuccino capuccino = new Capuccino();
        Frapuccino frapuccino = new Frapuccino();


        System.out.printf("Coffe instance igredients : Milk - " + coffe.getMilk() + " Sugar - " + coffe.getSugar() + " Coffe Powder - " + coffe.getCoffePowder());

        System.out.println(capuccino.getSugar());

        System.out.println(frapuccino.getSugar());

        System.out.println(frapuccino.getMilk());

        frapuccino.isCoffeGood();

        frapuccino.whatAboutFrapuccino();

        capuccino.isCapuccinoEvenBetter();


    }
}
