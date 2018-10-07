package com.doctacloak;

public class Dog {
    Dog(String name) {
        this.name = name;
    }

    String name;
    String breed;
    int age;
    float weight;

    void bark() {
        System.out.println("Ruff, ruff!");
    }

    void chaseCat() {
        System.out.println(name + " begins to chase a cat.");
    }
}
