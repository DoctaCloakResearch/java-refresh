package com.doctacloak;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Christopher", 60);
        System.out.println("New score is " + newScore);

        calculateScore(newScore);

        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player: " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static void calculateScore(int score) {
        System.out.println("The score was " + score + ".");
    }

    public static int calculateScore() {
        System.out.println("No player score.");
        return 0;
    }
}
