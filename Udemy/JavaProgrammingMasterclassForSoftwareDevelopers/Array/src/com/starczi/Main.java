package com.starczi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] intArray = getArray(5);
        printArray(intArray);
        System.out.println("Avg of that array is "+ getAvg(intArray));
    }
    public static double getAvg(int[] array){
        int sum = 0;
        for (int i=0; i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum/ (double)array.length;

    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Position "+i+ " equals " + array[i]);
        }
    }

    public static int[] getArray(int number) {
        System.out.println("Enter " + number + " int numbers");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
