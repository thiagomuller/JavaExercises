import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team>{
    List<T> teamList = new ArrayList<>();

    public void addTeam(T team){
        this.teamList.add(team);
    }

    public void showAllTeams(){
        Collections.sort(this.teamList);
        for(T team : this.teamList){
            System.out.println(team);
        }
    }
}

