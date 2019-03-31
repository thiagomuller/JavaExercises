package EncapsulationFirstFly;

public class Main {
    public static void main(String[] args){
//        Player player = new Player();
//        player.name = "Thiago";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining healt = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining healt = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Thiago" , 200  , "Sword");
        System.out.println("Initial health is : " + player.getHealth());
    }
}
