package com.doctacloak;

public class Animal {
    private String picture;
    private String food;
    private int hunger;
    private Integer[] boundaries = new Integer[2];
    private Integer[] location = new Integer[2];

    public void makeNoise() {
        System.out.println("Begins to make noise");
    }

    public int getHunger() {
        return hunger;
    }

    public void eat() {}

    public void sleep() {}

    public void roam() {}
}
