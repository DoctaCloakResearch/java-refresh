package com.doctacloak;

public class Main {

    public static void main(String[] args) {
        Song t2 = new Song();
        t2.setArtist("Travis");
        t2.setTitle("Sing");
        t2.play();

        Song s3 = new Song();
        s3.setArtist("Sex Pistols");
        s3.setTitle("My Way");
        int secret = s3.getSecret();
        System.out.println(secret);

        Dog dog = new Dog();
        dog.setName("Reemus");
        dog.bark(1);
        dog.size = 70;
        dog.bark(4);

        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();

        GoodDog[] pets;
        pets = new GoodDog[7];

        pets[0] = new GoodDog();
        pets[1] = new GoodDog();

        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(30);
        System.out.println(pets[0].equals(pets[1]));
    }
}
