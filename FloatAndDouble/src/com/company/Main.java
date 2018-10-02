package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int myIntValue = 5;

        float myFloatValue = 5.25f / 2; // Single precision.
        double myDoubleValue = 5.258d;
        float anotherFloat = (float) 5.4;
        System.out.println(myFloatValue + myDoubleValue);
        System.out.println("Another float " + anotherFloat);

        System.out.println(myIntValue);

        // Challenge
        double weightInPounds= 161.34;
        double weightInKilograms = (double) weightInPounds * (1 / 2.2_046_226_218d);
        System.out.println(weightInKilograms);
    }
}
