package SingleRoomChallenge;

public class Main {
    public static void main(String[] args){
        Room room  = new Room("Confortable" , "Full of unread books :(" , new Bathroom("Mordor or Winterfell" ,
                "Yes" , "Green") , new VideoGame("Sony" , "Last of Us"));

        room.showVideoGameInfo(); // I can't access video game object directly, since I've not a set a getter for it, and it's private
        room.getBathroom().showTowelInfo(); //Here I can access bathroom object directly, because I set a getter for it, although it's private too
    }
}
