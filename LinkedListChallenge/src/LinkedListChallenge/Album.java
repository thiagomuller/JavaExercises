package LinkedListChallenge;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> listOfSongs = new ArrayList<>();

    public Album(String name) {
        this.name = name;
    }

    public void addSong(String songName , String duration){
        Song song = new Song(songName , duration);
        this.listOfSongs.add(song);
    }

    public Song retrieveSong(String songName){
        for(Song song : listOfSongs){
            if(song.getName().equals(songName)){
                return song;
            }
        }
        return null;
    }
}
