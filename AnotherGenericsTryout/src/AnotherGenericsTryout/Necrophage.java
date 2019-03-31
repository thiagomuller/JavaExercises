package AnotherGenericsTryout;

public class Necrophage extends Monster{
    private boolean aghoul;
    private boolean drowner;
    private boolean rotfiend;
    private boolean ghoul;

    public Necrophage(String weakness, int hitPoints, String habitat, boolean aghoul , boolean drowner , boolean rotfiend, boolean ghoul) {
        super(weakness, hitPoints, habitat);
        this.aghoul = aghoul;
        this.drowner = drowner;
        this.rotfiend = rotfiend;
        this.ghoul = ghoul;
    }
}
