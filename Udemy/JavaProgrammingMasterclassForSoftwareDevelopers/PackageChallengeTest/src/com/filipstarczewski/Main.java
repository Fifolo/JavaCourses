package com.filipstarczewski;

import com.mathoperation.Series;

public class Main {

    public static void main(String[] args) {
        int n = 15;
        for (int i = 0; i < n; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println("\n==========\n");
        for (int i = 0; i < n; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("\n==========\n");
        for (int i = 0; i < n; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
