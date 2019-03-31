package AnotherGenericsTryout;

public class Draconid extends Monster {
    private boolean wyvern;
    private boolean mountainwyvern;
    private boolean dragon;

    public Draconid(String weakness, int hitPoints, String habitat, boolean wyvern , boolean mountainwyvern , boolean dragon) {
        super(weakness, hitPoints, habitat);
        this.wyvern = wyvern;
        this.mountainwyvern = mountainwyvern;
        this.dragon = dragon;
    }
}
