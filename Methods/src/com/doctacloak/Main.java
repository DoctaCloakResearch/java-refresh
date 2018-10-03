package com.doctacloak;

public class Main {

    public static void main(String[] args) {
        int highScore = calculatorScore(true, 800, 5, 100);

        if (highScore > -1)
            System.out.println("Your high score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Christopher", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ed", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Edd", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Eddy", highScorePosition);
    }

    public static int calculatorScore(boolean isGameOver, int score, int levelCompleted, int bonus) {
        if(isGameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("We won!  Our final score was " + finalScore);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int playerRank) {
        System.out.println(playerName + " managed to get into position " + playerRank);
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score > 1000) {
            position = 1;
        } else if (score > 500) {
            position = 2;
        } else if (score > 100) {
            position =  3;
        }

        return position;
    }
}
