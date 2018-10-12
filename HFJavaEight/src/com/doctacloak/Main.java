package com.doctacloak;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();

        AnimalList animals = new AnimalList();
        for (int i = 0; i < 25; i++) {
            animals.addAnimal(animals.getAnimals(), new Dog());
        }
        Animal[] myAnimals = animals.getAnimals();
        System.out.println(myAnimals.length);

        Object obj = new Object();
        System.out.println(dog.getClass());
        System.out.println(myAnimals.hashCode());
        Object o = dog;
        Dog d;
        if (o instanceof Dog) {
            d = (Dog) o;
            d.eat();
        }


    }
}
