package com.doctacloak;

public class Dog extends Canine {
    public void makeNoise() {
        System.out.println("Bark! Bark!");
    }

    @Override
    public void eat() {
        System.out.println("The dog begins to eat, thoroughly enjoying the food.");
    }
}
