package com.doctacloak;

public class Tesla extends Car {
    private boolean hasAutoPilot;

    public Tesla(String model, String directionMoving, int wheels, int windows) {
        super(model, directionMoving, wheels, windows);
    }

    public boolean isHasAutoPilot() {
        return hasAutoPilot;
    }

    public void setHasAutoPilot(boolean hasAutoPilot) {
        this.hasAutoPilot = hasAutoPilot;
    }
}
