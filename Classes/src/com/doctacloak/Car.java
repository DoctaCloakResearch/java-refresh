package com.doctacloak;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("holden")) {
            this.model = model;
        } else {
            System.out.println("Invalid model.");
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }
}
