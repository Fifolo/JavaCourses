package com.starczi;

public class Main {

    public static void main(String[] args) {
        char switchValue = 'o';
        switch (switchValue) {
            case 'A': case 'B': case 'C': case'D':
                System.out.println("The letter is "+ switchValue);
            default:
                System.out.println("The letter is different");
        }
    }
}
