package com.starczi;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers in array?");
        int number = scanner.nextInt();
        int [] myArray = makeArray(number);
        System.out.println("=====");
        printArray(myArray);
        reverse(myArray);
        printArray(myArray);
        int a = 5;
       // add(a);
       // System.out.println(a);

    }
    private static void add (int a){
        a = a*a;
    }
    private static int[] makeArray(int number){
        System.out.println("Put "+number+" numbers for your array");
        int[] array = new int[number];
        for(int i= 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }return array;
    }
    private static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("======");
    }
    private static void reverse(int[] array){
      int temp;
      int count = array.length-1;
        if(array.length%2!=0){
          for(int i = 0; i<=array.length/2;i++){
              temp = array[i];
              array[i]=array[count];
              array[count]=temp;
              count--;
          }
      }else {
            for(int i=0; i<=array.length/2-1;i++){
                temp = array[i];
                array[i]=array[count];
                array[count]=temp;
                count--;
            }
        }
    }
    private static void anotherReverse(int[] array){
        int temp;
        int lastIndex= array.length-1;
        for(int i = 0; i<array.length/2;i++){
            temp= array[i];
            array[i]= array[lastIndex-i];
            array[lastIndex-1]=temp;
        }
    }
}
