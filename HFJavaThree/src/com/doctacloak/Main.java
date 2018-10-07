package com.doctacloak;

import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {
        Dog fido = new Dog("Fido");
        fido.bark();
        fido.chaseCat();

        Dog[] myDogs = new Dog[3];
        myDogs[0] = fido;
        myDogs[0].bark();

        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[0].title = "The Grapes of Java";
        System.out.println(myBooks[0].title);
    }
}
