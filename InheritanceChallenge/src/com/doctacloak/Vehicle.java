package com.doctacloak;

public class Vehicle {
    private int speed;
    private String model;
    private char directionMoving;

    Vehicle() {
        this(0, "Ford", "Unknown");
    }

    Vehicle(int speed, String model, String directionMoving) {
        this.speed = speed;
        this.model = model;
    }

    public void setDirectionMoving(char direction) {
        this.directionMoving = direction;
    }

    public char getDirectionMoving() {
        return this.directionMoving;
    }

    public void accelerate(char direction) {
        switch (direction) {
            case 'N' : case 'S' : case 'E' : case 'W':
                this.setDirectionMoving(direction);
            default:
                System.out.println("Unknown Direction");
        }
    }
}
