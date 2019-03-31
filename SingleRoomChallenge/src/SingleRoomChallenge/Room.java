package SingleRoomChallenge;

public class Room {
    private String bed;
    private String bookshelf;
    private Bathroom bathroom;
    private VideoGame videogame;

    public Room(String bed, String bookshelf, Bathroom bathroom, VideoGame videogame) {
        this.bed = bed;
        this.bookshelf = bookshelf;
        this.bathroom = bathroom;
        this.videogame = videogame;
    }

    public String getBed() {
        return bed;
    }

    public String getBookshelf() {
        return bookshelf;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void showVideoGameInfo(){
        System.out.println("Video game company : " + videogame.getCompany());
        System.out.println("Video game game example : " + videogame.getGameExample());
    }

}
