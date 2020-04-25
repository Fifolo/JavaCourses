package com.filipstarczewski;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Pucha {
    private static int allPuchy = 0;
    private int exp;
    private boolean allSpele;
    private String jednostka;
    private static ArrayList<Pucha> puchas = new ArrayList<>(10);

    static {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\filip\\Desktop\\puchy.txt"));
            Random r = new Random();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] info = line.split(":, ");

                int exp = Integer.parseInt(info[0]);
                String jednostka = info[1];

                puchas.add(new Pucha(exp, r.nextBoolean(), jednostka));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error:" + e.getMessage());
            }
        }
    }

    public static void printPucha(Pucha p) {
        System.out.println("Exp = " + p.getExp() + "\nAllSpelle = " + p.isAllSpele() + "\nJednostka = " + p.getJednostka());
    }

    public Pucha(int exp, boolean allSpele, String jednostka) {
        this.exp = exp;
        this.allSpele = allSpele;
        this.jednostka = jednostka;
        this.allPuchy++;
    }

    public static int getAllPuchy() {
        return allPuchy;
    }

    public int getExp() {
        return exp;
    }

    public boolean isAllSpele() {
        return allSpele;
    }

    public String getJednostka() {
        return jednostka;
    }

    public static ArrayList<Pucha> getPuchas() {
        return puchas;
    }
}
