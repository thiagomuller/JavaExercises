package AnotherGenericsTryout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Horde<T extends Humanoid & HordeWarCry>{
    private List<T> warriors = new ArrayList<>();

    public void addWarrior(T warrior){
        this.warriors.add(warrior);
    }
    public void forTheHorde(){
        System.out.println("FOR THE HOOOOOOOOOOORDE!!!!!!!");
    }

    public void showWarriors(){
        Collections.sort(this.warriors, Collections.reverseOrder());
        for(Humanoid warrior : this.warriors){
            System.out.println(warrior.getName() + " has hit points equal to " + warrior.getHitPoints());
        }
    }
}
