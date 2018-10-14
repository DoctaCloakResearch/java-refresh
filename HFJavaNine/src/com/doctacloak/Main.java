package com.doctacloak;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting...\n");

        Duck daffyDuck= new Duck();
        System.out.println("Daffy duck size: " + daffyDuck.getSize()+ "\n");

        Duck donaldDuck = new Duck(42);
        System.out.println("Donald duck size: " + donaldDuck.getSize() + "\n");
        System.out.println("His parents name is ");
        Duck ragnarDuck = new Duck();

        System.out.println("\nDoctaCloak was here.  Just so you know.");
    }
}
