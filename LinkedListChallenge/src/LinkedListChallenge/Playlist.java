package LinkedListChallenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist{
    private String name;
    private LinkedList<Song> listOfSongs = new LinkedList<>();
    private Song currentSong;
    private int currentIndex = 0;

    public Playlist(String name) {
        this.name = name;
    }

    public void addSong(Album album , String songName){
        Song song = album.retrieveSong(songName);
        this.listOfSongs.add(song);
    }

    public void showAllSongsFromPlaylist(){
        this.listOfSongs.forEach(song -> {
            System.out.println(song.getName());
        });
    }

    public String backwards(){
        if(listOfSongs.get(currentIndex - 1) != null){
            currentIndex -= 1;
            this.currentSong = this.listOfSongs.get(currentIndex);
            return currentSong.getName();
        }
        else{
            System.out.println("We're on beginning of the playlist, we can't go backwards right now!\n");
            return "null";
        }
    }


    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = this.listOfSongs.listIterator();
        if(this.listOfSongs.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {

            System.out.println("Available actions:\npress");
            System.out.println("0 - to quit\n" +
                    "1 - to play next song\n" +
                    "2 - to play previous song\n" +
                    "3 - to replay the current song\n" +
                    "4 - list songs in the playlist\n" +
                    "5 - delete current song from playlist");

            System.out.println("Now playing " + listIterator.next().getName());

        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getName());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getName());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().getName());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().getName());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    this.showAllSongsFromPlaylist();
                    break;
                case 5:
                    if(this.listOfSongs.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().getName());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().getName());
                        }
                    }
                    break;

            }
        }
    }

}
