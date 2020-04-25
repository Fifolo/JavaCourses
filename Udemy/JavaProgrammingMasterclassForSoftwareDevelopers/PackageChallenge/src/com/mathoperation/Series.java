package com.mathoperation;

public class Series {
    public static long nSum(int n) {
        if (n == 0) return 0;
        long sum = 1;
        int i = 2;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static long factorial(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long sum = 1;
        int i = 2;
        while (i <= n) {
            sum *= i;
            i++;
        }
        return sum;
    }

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long[] array = {0, 1};
        long temp;
        for (int i = 0; i < n; i++) {
            array[0] += array[1];

            temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }
        return array[0];
    }

}
