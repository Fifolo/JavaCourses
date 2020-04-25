package com.starczi;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number is " + number);
            evenCount++;
            if (evenCount == 5) {
                break;
            }

        }
        System.out.println("Found " + evenCount + " even numbers");

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }
}
