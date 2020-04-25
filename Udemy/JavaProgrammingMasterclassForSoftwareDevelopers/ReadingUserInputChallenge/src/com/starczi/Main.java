package com.starczi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + " ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (order == 10) break;
            } else System.out.println("Invalid number");
            scanner.nextLine();
        }
        System.out.println("Sum of those numbers = "+sum);
        scanner.close();
    }
}
