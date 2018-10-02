package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        int a, b, c;
        a = 5;
        b = 6;
        c = 9;
        System.out.println(a + b + c);

        result = result - 1;

        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien.");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        if (topScore == 100)
            System.out.println("You got it!");


        boolean isCar = true;
        if (isCar)
            System.out.println("Yeet");

        boolean isBored = false;
        if (!isBored)
            System.out.println("Aww you are bored?");

        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar is " + wasCar);

        double myDouble = 20d;
        double yourDouble = 80d;
        double ourDoubles = (myDouble + yourDouble) * 25;
        double whatIsLeft = ourDoubles % 40;
        boolean isOverLimit = whatIsLeft <= 20 ? true : false;
        if (isOverLimit)
            System.out.println("Total was over limit.");

    }
}
