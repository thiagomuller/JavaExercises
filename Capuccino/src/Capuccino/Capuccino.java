package Capuccino;

public class Capuccino extends Coffe{

    private int chocolate;

    public Capuccino(){
        this(1);
    }

    public Capuccino(int chocolate) {
        super(1, 1 , 1);
        this.chocolate = chocolate;
    }


    public void isCapuccinoEvenBetter(){
        System.out.println("Yes, capuccino rules them all!!!\n");
    }
}

