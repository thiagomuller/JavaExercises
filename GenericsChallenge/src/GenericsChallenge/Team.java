package GenericsChallenge;

public abstract class Team implements Comparable<Team> {
    protected String name;
    protected int points;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int compareTo(Team o) {
        if (this.points > o.points) {
            return 1;
        } else if (this.points < o.points) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Team: " +
                "name: " + name + '\'' +
                ", points: " + points +
                '.';
    }
}
