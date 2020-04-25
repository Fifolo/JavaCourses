package com.starczi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        int max=0;
        int min=0;
        boolean first = true;
        while(true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order);
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                if (first) {
                    max = number;
                    min = number;
                    first = false;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                counter++;
                if (counter == 5) {
                    break;
                }
            }
            else{
                System.out.println("Invalid number");
            }scanner.nextLine();
        }
        System.out.println("Max = "+max+" and Min = "+min);
        scanner.close();

    }
}
