package com.doctacloak;

import java.util.Arrays;

public class AnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void addAnimal(Animal[] arr, Animal a) {
        if (nextIndex < arr.length) {
            arr[nextIndex] = a;
            nextIndex++;
        } else {
            resize(arr);
        }
    }

    public void resize(Animal[] a) {
        Animal[] newAnimals = new Animal[a.length * 2];
        nextIndex = 0;
        for (Animal animal : a) {
            this.addAnimal(newAnimals, animal);
        }
        this.animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }
}
