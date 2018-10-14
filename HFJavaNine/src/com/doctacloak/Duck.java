package com.doctacloak;
// Examples for working with constructors.
public class Duck extends Animal {
    String name;
    int size;

    public Duck() {
        // supply default size
        name = "Unknown";
        size = 27;
        super.setName(name);
        System.out.println("Making a duck...");

    }

    public Duck(int size) {
        name = "Unknown";
        this.size = size;
        super.setName(name);
        System.out.println("Making a duck...");
    }

    public Duck(String name) {
        super(name);
        this.name = name;
        size = 27;
    }

    public Duck(String name, int size) {
        super(name);
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
