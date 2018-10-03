package com.doctacloak;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

	    int myIntValue = 10;
	    int anotherIntValue = myIntValue;

        // Value Types.
        // Both won't change if you change one.
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArary = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("myIntArray after change = " + Arrays.toString(myIntArray));
        System.out.println("anotherArary after change = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);
    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[] { 1, 2, 3, 4, 5};
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // avoid input error
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}
