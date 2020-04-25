package com.starczi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getArray(5);
        printArray(myArray);
        myArray = sortArray(myArray);
        System.out.println(" ");
        printArray(myArray);


    }

    public static int[] getArray(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println("Position " + i + " equals " + arrayToPrint[i]);
        }
    }

    public static int[] sortArray(int[] arrayToSort) {
        int[] sortedArray = Arrays.copyOf(arrayToSort,arrayToSort.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            {
                for (int i = 0; i < sortedArray.length - 1; i++) {
                    if (sortedArray[i] < sortedArray[i + 1]) {
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[i + 1];
                        sortedArray[i + 1] = temp;
                        flag = true;
                    }
                }
            }
        }
        return sortedArray;
    }
}
