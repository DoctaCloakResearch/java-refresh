package com.doctacloak;

import java.util.Scanner;

public class SimpleDotCom {
    private Scanner scanner = new Scanner(System.in);

    private int[] locationCells;
    private int numOfHits = 0;

    public int getNumOfHits() {
        return numOfHits;
    }

    public void setNumOfHits(int numOfHits) {
        this.numOfHits = numOfHits;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                numOfHits++;
                if (numOfHits == locationCells.length) {
                    result = "kill";
                } else {
                    result = "hit";
                    break;
                }
            } else {
                result ="miss";
            }
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
}
