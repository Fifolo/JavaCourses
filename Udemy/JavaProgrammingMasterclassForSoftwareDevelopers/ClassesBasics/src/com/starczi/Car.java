package com.starczi;

//class- blueprint/template for an object that we are creating
public class Car {
    //fields || class/member variables + access modifier
    // encapsulation in Java is used to hide the fields and methods from access publicly.
    //So these variables are actually the state component for a Car,so, characteristics of a Car
    // kiedy odwołujemy się do"fieldów" piszemy "this.nazwa_fielda"
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
