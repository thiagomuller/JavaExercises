public class Main {
    public static void main(String[] args){
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);


        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);


        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        Team<FootballPlayer> hawThorn = new Team<>("Hawthorn");

        hawThorn.matchResult(fremantle , 1, 0);
        hawThorn.matchResult(adelaideCrows , 3, 8);

        adelaideCrows.matchResult(fremantle , 2 ,1 );
//        adelaideCrows.matchResult(baseballTeam , 1 , 1);

        System.out.println("Rankings\n");
        System.out.println(adelaideCrows.getName() + " " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + " " + melbourne.ranking());
        System.out.println(fremantle.getName() + " " + fremantle.ranking());
        System.out.println(hawThorn.getName() + " " + hawThorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawThorn));
        System.out.println(hawThorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

    }
}
