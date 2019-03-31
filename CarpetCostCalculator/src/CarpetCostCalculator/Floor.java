package CarpetCostCalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if(width < 0){
            width = 0;
        }
        else{
            this.width = width;
        }
    }

    public void setLength(double length) {
        if(length < 0){
            length = 0;
        }
        else{
            this.length = length;
        }
    }

    public double getArea(){
        return this.width * this.length;
    }
}
