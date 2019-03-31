package SingleRoomChallenge;

public class Bathroom {
    private String shower;
    private String isThereASink;
    private String towelCollor;

    public Bathroom(String shower, String isThereASink, String towelCollor) {
        this.shower = shower;
        this.isThereASink = isThereASink;
        this.towelCollor = towelCollor;
    }

    public void showTowelInfo(){
        System.out.println("Towel collor is usually : " + towelCollor);
    }

    public String getShower() {
        return shower;
    }

    public String getIsThereASink() {
        return isThereASink;
    }

    public String getTowelCollor() {
        return towelCollor;
    }
}
