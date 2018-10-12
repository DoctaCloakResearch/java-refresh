package com.doctacloak;

public class Dog extends Canine implements Pet {
    public void makeNoise() {
        System.out.println("Bark! Bark!");
    }

    @Override
    public void eat() {
        System.out.println("The dog begins to eat, thoroughly enjoying the food.");
    }

    @Override
    public void beFriendly() {
        System.out.println("Wags tail, smiling");
    }

    @Override
    public void play() {
        System.out.println("Jumps around, happy.  Then runs to get a toy.");
    }
}
