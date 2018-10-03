package com.doctacloak;

public class Car extends Vehicle {
    private int wheels;
    private int windows;

    public Car(String model, String directionMoving, int wheels, int windows) {
        super(0, model, directionMoving);
        this.wheels = wheels;
        this.windows = windows;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }
}
