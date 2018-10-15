package com.doctacloak;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Enter a count");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int[] reversedArray = reverseArray(returnedArray);
        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            scanner.hasNextInt();
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int index = 0;
        for(int i = array.length - 1; i > -1; i--) {
            reversedArray[index] = array[i];
            index++;
        }
        return reversedArray;
    }
}
