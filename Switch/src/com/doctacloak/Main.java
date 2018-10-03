package com.doctacloak;

public class Main {

    public static void main(String[] args) {
	    int age = 23;
	    switch (age) {
            case 23:
                System.out.println("You are 23?");
                break;
            case 22:
                System.out.println("Ahh I'm a year older than you.");
                break;
            case 21:
                System.out.println("Oh cool, you can rent a car, how lucky.");
                break;
            case 3: case 4: case 5:
                System.out.println("Ehhh you are young mate, just a little sprout.");
                break;
            default:
                System.out.println("Uh I don't know, you are old or young  There is no case for you in the code though.");
                break;
        }

        String month = "October";

	    switch(month.toUpperCase()) {
            case "OCTOBER":
                System.out.println("Boooo, scary!");
                break;
            case "NOVEMBER":
                System.out.println("Yumm, Turkey.");
                break;
            case "DECEMBER":
                System.out.printf("Jingle Bells, Jingle Bells!");
                break;
        }
    }
}
