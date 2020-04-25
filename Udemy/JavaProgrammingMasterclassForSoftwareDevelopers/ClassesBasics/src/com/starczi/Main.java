package com.starczi;

public class Main {

    public static void main(String[] args) {
        // "data type" Car
        // object called "porsche" based on a template -> Car;
        Car porsche= new Car();
        Car holden = new Car();
        porsche.setModel("carrera");
        System.out.println("Porshe's model is "+porsche.getModel());
    }
}
