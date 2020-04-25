package com.filipstarczewski;

import java.util.Scanner;

public class X {
    private static Scanner scanner = new Scanner(System.in);

    private int x;

    public void x() {
        System.out.println("Give me a number: ");
        this.x = scanner.nextInt();
        scanner.nextLine();
        for (int x = 1; x <= 12; x++) {
            System.out.println(x + " times " + this.x + " = " + this.x * x);
        }
    }
}
