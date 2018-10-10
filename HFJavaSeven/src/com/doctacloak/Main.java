package com.doctacloak;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Canine canine = new Canine();
        canine.roam();

        Dog dog = new Dog();
        dog.makeNoise();
        System.out.println(dog.getHunger());
    }
}
