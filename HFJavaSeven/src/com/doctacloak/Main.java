package com.doctacloak;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Canine canine = new Canine();

        Dog dog = new Dog();

        Animal myDog = new Dog();

        Animal[] animals = new Animal[5];
        animals [0] = new Dog();
        animals[1] = new Cat();

        int count = 0;
        for ( Animal animal : animals) {
            if (count == 2) {
                break;
            }
            
            animal.makeNoise();
            animal.roam();
            count++;
        }
        System.out.println("Yeet");
        Cat kitten = new Cat();
        kitten.eat("Fish");

    }
}
