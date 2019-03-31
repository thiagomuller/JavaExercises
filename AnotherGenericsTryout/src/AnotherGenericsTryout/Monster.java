package AnotherGenericsTryout;

public abstract class Monster {
    private String weakness;
    private int hitPoints;
    private String habitat;

    public Monster(String weakness, int hitPoints, String habitat) {
        this.weakness = weakness;
        this.hitPoints = hitPoints;
        this.habitat = habitat;
    }
}
