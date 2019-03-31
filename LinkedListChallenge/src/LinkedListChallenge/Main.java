package LinkedListChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Album> albuns = new ArrayList<>();
        Album audioslave = new Album("Audioslave");
        audioslave.addSong("Cochise" , "3:42");
        audioslave.addSong("Show Me How to Live" , "4:38");
        audioslave.addSong("Gasoline" , "4:39");
        audioslave.addSong("What You Are" , "4:09");
        audioslave.addSong("Like a Stone" , "4:54");
        audioslave.addSong("Set It Off" , "4:23");
        audioslave.addSong("Shadow on the Sun" , "5:43");
        audioslave.addSong("I Am the Highway" , "5:35");
        audioslave.addSong("Exploder" , "3:26");
        audioslave.addSong("Hypnotize" , "3:27");
        audioslave.addSong("Bring Em Back Alive" , "5:29");
        audioslave.addSong("Light My Way" , "5:03");
        audioslave.addSong("Getaway Car" , "4:59");
        audioslave.addSong("The Last Remaining Light" , "5:17");
        albuns.add(audioslave);

        Album fireball = new Album("Fireball");
        fireball.addSong("Fireball" , "3:25");
        fireball.addSong("No No No" , "6:54");
        fireball.addSong("Demon's Eye" , "5:19");
        fireball.addSong("Anyone's Daughter" , "4:43");
        fireball.addSong("The Mule" , "5:23");
        fireball.addSong("Fools" , "8:21");
        fireball.addSong("No One Came" , "6:28");
        albuns.add(fireball);

        Playlist playlist = new Playlist("My fav songs");
        playlist.addSong(audioslave , "Like a Stone");
        playlist.addSong(audioslave , "Getaway Car");
        playlist.addSong(fireball , "Fools");
        playlist.addSong(fireball , "Fireball");

        playlist.play();
    }
}