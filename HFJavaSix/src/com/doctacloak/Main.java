package com.doctacloak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //	    Array List
        ArrayList<String> groceryList = new ArrayList<String>();

        groceryList.add("Eggs");
        System.out.println(groceryList.size());

        boolean hasEggs = groceryList.contains("Eggs");
        System.out.println(hasEggs);

        int eggsIndex = groceryList.indexOf("Eggs");

        System.out.println("The eggs are at index #" + eggsIndex );

        boolean isEmpty = groceryList.isEmpty();

        System.out.println(isEmpty);

        groceryList.remove("Eggs");
        System.out.println(groceryList.size());

        groceryList.add("Cheese");
        groceryList.add("Meat");

        ArrayList<String> monthsInYear = new ArrayList<String>();
        monthsInYear.add("January");
        monthsInYear.add("February");
        monthsInYear.add("March");
        System.out.println(monthsInYear.get(2));

        String [] myFriend = new String[3];
        myFriend[0] = "Tommy";
        System.out.println(myFriend[0]);
    }
}
