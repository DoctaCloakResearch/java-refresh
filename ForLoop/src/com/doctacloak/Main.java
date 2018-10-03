package com.doctacloak;

public class Main {

    public static void main(String[] args) {
	    for(double i = 2; i < 9; i++)
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));

        for(double i = 8; i > 1; i--)
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
    }

    private static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
