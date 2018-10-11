package com.doctacloak;

public class Cat extends Animal {
    public Cat() {}

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }

    @Override
    public void roam() {
        System.out.println("The cat is roaming...");
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void eat(String food) {
        System.out.println("The cat begins to eat " + food);
    }
}
