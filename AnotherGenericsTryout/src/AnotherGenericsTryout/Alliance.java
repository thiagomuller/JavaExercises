package AnotherGenericsTryout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alliance<T extends Humanoid & AllianceWarCry>{
    private List<T> warriors = new ArrayList<>();

    public void addWarrior(T warrior){
        this.warriors.add(warrior);
    }

    public void showWarriors(){
        Collections.sort(this.warriors);
        for(Humanoid warrior : this.warriors){
            System.out.println(warrior.getName() + " has hit points equal to " + warrior.getHitPoints());
        }
    }
}
