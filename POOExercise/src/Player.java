public class Player  extends Person{
    private String game;
    private boolean win;

    public Player(String name, String lastName, int age, String game, boolean win) {
        super(name, lastName, age);
        this.game = game;
        this.win = win;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    @Override
    public void sayMyName() {
        System.out.println("I'M OVERRIIIIIIIIIIIIIIIIIIIIIIIIIIIIIDING WEEEEEEEEEEEEEEEEEEEEEEE");
    }
}
