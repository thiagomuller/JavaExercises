package GenericsChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team>{
    private List<T> teams = new ArrayList<>();

    public void addTeams(T team){
        teams.add(team);
    }

    public void printTeam(){
       Collections.sort(this.teams, Collections.reverseOrder());
       for(T team : this.teams){
           System.out.println(team);
       }
    }

}
