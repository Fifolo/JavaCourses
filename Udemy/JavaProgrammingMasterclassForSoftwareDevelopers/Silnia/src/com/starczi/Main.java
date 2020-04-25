package com.starczi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wpisz liczbe");
        int liczba = scanner.nextInt();
        System.out.println("!"+liczba+ " = "+rekurencyjnie(liczba));

    }
    public static int iteracyjnie(int liczba){
        int suma = 1;
        for(int i=liczba;i>0;i--){
            suma*=i;
        }return suma;
    }
    public static int rekurencyjnie(int liczba){
        if(liczba==0){
            return 1;
        }else{
            return liczba * rekurencyjnie(liczba-1);
        }
    }
}
