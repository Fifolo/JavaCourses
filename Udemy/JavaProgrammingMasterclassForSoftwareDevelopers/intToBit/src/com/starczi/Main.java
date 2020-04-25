package com.starczi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        int a = random.nextInt(11);
        int b= random.nextInt(11);

        float c =(float) Math.random();
        System.out.println("c = "+ c);

        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(40);
        tab.add(80);
        System.out.println("tab[0] = "+tab.get(0).intValue()+tab.get(1).intValue());

//        try {
//            System.out.println("Wpisz liczbe ");
//            int liczba = scanner.nextInt();
//            int[] tab = new int[8];
//            while (true) {
//                if (liczba < 0) {
//                    tab[0] = 1;
//                    liczba *= -1;
//                } else tab[0] = 0;
//                for (int i = tab.length - 1; i >= 1; i--) {
//                    if (liczba % 2 == 1) {
//                        tab[i] = 1;
//                        liczba /= 2;
//                    } else
//                        liczba /= 2;
//                }
//                break;
//            }
//            for (int i = 0; i < tab.length; i++) {
//                System.out.print(tab[i]);
//            }
//
//        } catch (InputMismatchException e) {
//            System.out.println("wpisz liczbe zamiast litery " + e);
//        }
    }
}
