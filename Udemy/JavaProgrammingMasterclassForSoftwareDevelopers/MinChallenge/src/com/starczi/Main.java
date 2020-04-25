package com.starczi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = readInt(5);

        System.out.println("Minimum element = "+ findMin(myArray));
    }
    public static int [] readInt(int number){
        System.out.println("Give me "+ number + " numbers");
        int[] array = new int[number];
        for(int i = 0; i<array.length;i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array){
        int min=99999999;
        for(int i = 0; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            }
        }return min;
    }
}
