package com.doctacloak;

import java.util.Arrays;

public class Main {

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
    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[] { 1, 2, 3, 4, 5};
    }
}
