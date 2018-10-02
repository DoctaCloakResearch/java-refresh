package com.doctacloak;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 5_000;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if(score == 5_000 && score > 1000)
	        System.out.println("Your score was 5000");

	    System.out.println((score == 5000 && score > 1000)? "Your score was 5000, nice!" : "Aww");

		//  Challenge
		score = 10_000;
		levelCompleted = 8;
		bonus = 200;
		System.out.println((score == 10_000 && score > 1_000)? ("Your final score was " + score + ", nice!") : "Aww");

		if (score == 1000) {
			System.out.println("The score is 1,000");
		} else if (score == 10_000)
			System.out.println("The score is 10,000");
    }
}
