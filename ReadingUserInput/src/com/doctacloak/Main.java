package com.doctacloak;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character enter key.

            int age = 2018 - yearOfBirth;

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ".");
                System.out.println("You were born in the year " + yearOfBirth + " so you are " + age + ".");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close(); // Close scanner after using it.

    }
}
