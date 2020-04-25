package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    private SongList tracks;

    public Album(String name) {
        this.name = name;
        tracks = new SongList();
    }
    public void addSong(String name, double duration){
        Song song = new Song(name,duration);
        tracks.addSong(song);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return tracks.getSongs();
    }

    public Song getTrack(String name) {
       return tracks.getOneSong(name);
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public boolean addSong(Song song) {
            if (!findSong(song.getName())) {
                this.songs.add(song);
                System.out.println("Song added");
                return true;
            } else {
                System.out.println("That song already exists");
                return false;
            }
        }

        private boolean findSong(String name) {
            for (int i = 0; i < songs.size(); i++) {
                if (songs.get(i).getName().equals(name)) {
                    System.out.println("Song found");
                    return true;
                }
            }
            System.out.println("Song not found");
            return false;
        }

        public Song getOneSong(String name) {
            for (int i = 0; i < songs.size(); i++) {
                if (songs.get(i).getName().equals(name)) {
                    return songs.get(i);
                }
            }
            System.out.println("Song not found");
            return null;
        }
    }

}
