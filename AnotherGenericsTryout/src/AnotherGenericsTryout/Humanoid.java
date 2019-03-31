package AnotherGenericsTryout;

public abstract class Humanoid implements Comparable<Humanoid>{
    private String name;
    private int age;
    private String weapon;
    private int hitPoints;
    private int manaPoints;
    private String profission;

    public Humanoid(String name, int age, String weapon, int hitPoints , int manaPoints, String profission) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.hitPoints = hitPoints;
        this.manaPoints = manaPoints;
        this.profission = profission;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public int compareTo(Humanoid o) {
        if(this.getHitPoints() > o.getHitPoints()){
            return 1;
        }
        if(this.getHitPoints() < o.getHitPoints()){
            return -1;
        }
        return 0;
    }
}
