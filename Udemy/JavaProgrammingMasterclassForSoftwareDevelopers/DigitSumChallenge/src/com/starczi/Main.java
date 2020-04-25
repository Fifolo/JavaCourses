package com.starczi;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of digits= "+sumDigits(12));
        System.out.println("Sum of digits= "+sumDigits(9));
        System.out.println("Sum of digits= "+sumDigits(231321));
        System.out.println("Sum of digits= "+sumDigits(-5));
    }
    public static int sumDigits (int number){
        int sum=0;
        if (number<=10){
            return -1;
        }
        while(number>0){
            sum+=number%10;
            number=number/10;
        }return sum;

    }
}
