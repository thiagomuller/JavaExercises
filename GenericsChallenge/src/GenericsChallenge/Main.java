package GenericsChallenge;

public class Main {
    public static void main(String[] args) {
        League<BaseballTeam> baseballLeague = new League<>();
        BaseballTeam hawthorn = new BaseballTeam("Hawthorn" , 150);
        BaseballTeam melbourne = new BaseballTeam("Melbourne" , 120);
        BaseballTeam ravenclaw = new BaseballTeam("Ravenclaw" , 350);
        baseballLeague.addTeams(hawthorn);
        baseballLeague.addTeams(melbourne);
        baseballLeague.addTeams(ravenclaw);
        baseballLeague.printTeam();
    }
}
