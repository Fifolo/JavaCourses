package com.filipstarczewski;

import java.util.ArrayList;

import static com.filipstarczewski.Pucha.getAllPuchy;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < Pucha.getPuchas().size(); i++) {
            Pucha.printPucha(Pucha.getPuchas().get(i));
            System.out.println("====");
        }
        System.out.println(getAllPuchy());
        Pucha pucha = new Pucha(3423, false, "sdadsad");
        System.out.println(getAllPuchy());

    }
}
