package AnotherGenericsTryout;

public class Main {
    public static void main(String[] args) {
        Necrophage ghoul = new Necrophage("Necrophage oil" , 120 , "Swamp", false , false, false, true);
        Draconid wyvern = new Draconid("Grapeshot" , 350 , "Mountains", true , false , false);
        Enemies<Monster> enemies = new Enemies<>();
        enemies.addEnemy(ghoul);
//        Alliance<Human> alliance = new Alliance<>();
//        Human anduin = new Human("Anduin" , 28 , "Shalamayne", 3000, 1500, "Paladin");
//        anduin.forTheAlliance();
//        alliance.addWarrior(anduin);
        Orc thrall = new Orc("Thrall" , 58 , "Doomhammer", 5000 , 3000, "Shaman");;
        Orc grommHellscream = new Orc("Gromm", 60 ,"Gorehowl" , 4300 , 2000, "Warrior");
        Horde<Orc> horde = new Horde<>();
        horde.addWarrior(thrall);
        horde.addWarrior(grommHellscream);
        horde.showWarriors();
    }
}
