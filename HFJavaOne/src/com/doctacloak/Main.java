package com.doctacloak;

public class Main {

    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the Loop.");
        while ( x < 4 ) {
            System.out.println("In the loop");
            System.out.println("The value of x is " + x);
            x++;
        }
        System.out.println("This is after the loop.");

        IfTest test = new IfTest();
        PhraseOMatic phrase = new PhraseOMatic();
    }
}

class IfTest {
    public IfTest() {
        int x = 3;
        if ( x == 3 ) {
            System.out.println("x must be 3");
        }
        System.out.println("This runs no matter what.");
    }
}

class PhraseOMatic {
    public PhraseOMatic() {
        String[] wordListOne = {
                "24/7",
                "multi-Tier",
                "30,000 FT",
                "B-to-B",
                "win-win",
                "frontend",
                "web-based",
                "pervasive",
                "smart",
                "sixsigma",
                "critical-path",
                "dynamic"
        };
        String[] wordListTwo = {
                "aWord",
                "anotherWord"
        };

        String[] fruitList = {
                "Apple",
                "Pear",
                "Mango",
                "Blueberry",
                "Strawberry"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = fruitList.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        System.out.println(wordListOne[1]);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + fruitList[rand3];
        System.out.println("What we need is a " + phrase);

        Shuffle1 shuffle = new Shuffle1();

        Exercise1b exercise1b = new Exercise1b();

        Test test = new Test();
    }
}

class Shuffle1 {
    public Shuffle1() {
        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("a");

                x = x - 1;

                System.out.print("-");
            }

            if (x == 2) {
                System.out.print("b c");
                x = x - 1;

                System.out.print("-");
            }

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }

    }
}


class Exercise1b {
    public Exercise1b () {
        // Issue:  The book code would have turned into an infinite loop.  This is a fix.
        int x = 1;
        while ( x  < 10 ) {
            if ( x > 3 ) {
                System.out.println("big x");
            }
            x++;
        }
    }
}

class Test {
    public Test() {
        int x = 0;
        int y = 0;
        while ( x < 5 ) {
            x++;
            y = y + x * 25;
        }
        System.out.println(x + "" + y + " ");
    }
}

class PoolProblem {
    public PoolProblem() {

    }
}