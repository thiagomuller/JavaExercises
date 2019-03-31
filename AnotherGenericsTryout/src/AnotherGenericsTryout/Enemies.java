package AnotherGenericsTryout;

import java.util.ArrayList;
import java.util.List;

public class Enemies<T extends Monster> {
    private List<T> enemies = new ArrayList<>();

    public void addEnemy(T enemy){
        this.enemies.add(enemy);
    }
}
