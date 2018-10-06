package com.doctacloak;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 12;
        d.breed = "Vlak";
        d.name = "Sam";

        d.bark();

        Movie m = new Movie();
        m.genre = "Horror";
        m.rating = -2;
        m.title = "Spooky movie";
        m.startMovie();

        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if (t.canRecord) {
            t.recordTape();
        }

        DrumKit drumKit = new DrumKit();
        if (drumKit.hasSnare) {
            drumKit.playSnare();
            drumKit.hasSnare = false;
        }
        drumKit.playTopHat();
    }
}

