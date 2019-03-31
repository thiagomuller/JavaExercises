package Capuccino;

public class Frapuccino extends Coffe{

    private int ice;

    public Frapuccino(){
        this(1);
    }

    public Frapuccino(int ice) {
        super(1, 1, 1);
        this.ice = ice;
    }

    public void whatAboutFrapuccino(){
        System.out.printf("Well, this one is very good, but capuccino still rules them all\n");
    }
}
