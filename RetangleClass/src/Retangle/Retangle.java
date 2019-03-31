package Retangle;

public class Retangle {

    private int x;
    private int y;
    private int width;
    private int height;

    //1st constructor
    public Retangle(){
        this(0,0);
    }

    //2st constructor
    public Retangle(int x, int y){
        this(x,y,0,0);
    }

    //3st constructor
    public Retangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
