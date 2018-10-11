package com.doctacloak;

public class Animal {
    private String name;
    private String picture;
    private String food;
    private int hunger;
    private Integer[] boundaries = new Integer[2];
    private Integer[] location = new Integer[2];

    public void makeNoise() {
        System.out.println("Begins.. to make noise");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public void eat() {
        System.out.println("Nom, Nom, Nom!");
    }

    public void sleep() {}

    public void roam() {
        System.out.println("Is roaming...");
    }
}
