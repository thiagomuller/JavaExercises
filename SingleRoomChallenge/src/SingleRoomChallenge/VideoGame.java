package SingleRoomChallenge;

public class VideoGame {
    private String company;
    private String gameExample;

    public VideoGame(String company, String gameExample) {
        this.company = company;
        this.gameExample = gameExample;
    }

    public String getCompany() {
        return company;
    }

    public String getGameExample() {
        return gameExample;
    }
}
