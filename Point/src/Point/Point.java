package Point;

public class Point {

    private int x;
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceWithoutAnyParameters(){
        double distance = (0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y);
        return Math.sqrt(distance);
    }

    public double distanceWithTwoParameters(int x , int y){
        double distance = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
        return Math.sqrt(distance);
    }

    public double distanceWithAnotherOfTypePoint(Point point){
        return distanceWithTwoParameters(point.x , point.y );
    }
}
