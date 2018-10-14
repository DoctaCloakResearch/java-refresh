package com.doctacloak;

public abstract class Animal {
    private String name;

    public Animal() {
        System.out.println("Making an animal...");
    }

    public Animal (String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
