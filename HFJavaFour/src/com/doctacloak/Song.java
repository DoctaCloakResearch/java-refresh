package com.doctacloak;

public class Song {
    private String title;
    private String artist;

    void setTitle(String title) {
        this.title = title;
    }

    void setArtist(String artist) {
        this.artist = artist;
    }

    void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    int getSecret() {
        return 42;
    }
}
