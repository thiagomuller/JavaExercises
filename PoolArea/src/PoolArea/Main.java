package PoolArea;

public class Main {
    public static void main(String[] args){
        Retangle retangle = new Retangle(5,1);
        System.out.println("Retangle width : " + retangle.getWidth());
        System.out.println("Retangle length : " + retangle.getLength());
        System.out.println("Retangle area : " + retangle.getArea());
        Cuboid cuboid = new Cuboid(5,1,5);
        System.out.println("Cuboid width : " + cuboid.getWidth());
        System.out.println("Cuboid length : " + cuboid.getLength());
        System.out.println("Cuboid area : " + cuboid.getArea());
        System.out.println("Cuboid height : " + cuboid.getHeight());
        System.out.println("Cuboid volume : " + cuboid.getVolume());
    }
}
