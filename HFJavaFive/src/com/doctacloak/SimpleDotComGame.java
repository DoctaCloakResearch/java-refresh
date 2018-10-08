package com.doctacloak;

public class SimpleDotComGame {
    public SimpleDotComGame() {
        SimpleDotCom dotcom = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dotcom.setLocationCells(locations);
        String userGuess = "2";
        String result = dotcom.checkYourself(userGuess);
        String testResultOne = "failed";
        String testResultTwo = "failed";

        if (result.equals("hit")) {
            if(dotcom.getNumOfHits() == 1) {
                testResultOne = "passed";
            }
        }
        System.out.println(testResultOne);

        //        Reset
        dotcom.setNumOfHits(0);

        userGuess = "6";
        result = dotcom.checkYourself(userGuess);
        if (result.equals("miss")) {
            if(dotcom.getNumOfHits() == 0) {
                testResultTwo = "passed";
            }
        }

        System.out.println(testResultTwo);
    }
}
