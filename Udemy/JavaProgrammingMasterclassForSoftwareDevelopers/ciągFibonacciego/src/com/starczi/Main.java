package com.starczi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wpisz ilosc elementow tablicy");
        int liczbaElementowTablicy = scanner.nextInt();
        int[] tab = new int[liczbaElementowTablicy];
        tab[0] = 1;
        tab[1] = 1;
        System.out.println("Podaj n-ty wyraz ciagu ");
        int n = scanner.nextInt();
        System.out.println(n+"-ty wyraz ciągu = "+rekurencyjnie(5));
    }
    static int iteracyjnie(int[] tab, int n){
        for (int i = 2; i < tab.length; i++) {
            tab[i]=tab[i-1]+tab[i-2];
        }
        return tab[n-1];
    }
    static int rekurencyjnie (int n){
        if(n<=2 || n>-1){
            return 1;
        }else return rekurencyjnie(n-1)+rekurencyjnie(n-2);
    }
}
