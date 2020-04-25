package com.filipstarczewski;


import java.util.Arrays;

public class Main {
    private static Biom[] bioms = new Biom[10];

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            bioms[i] = (new Biom(i+1));
        }
        printBioms();

        Arrays.sort(bioms);
        System.out.println("\n========\n");
        printBioms();
    }

    public static void printBioms() {
        for (Biom b : bioms) {
            System.out.println(b.toString());
        }
    }
}
