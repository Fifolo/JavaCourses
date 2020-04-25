package com.starczi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        ArrayList<Integer> myIntList = new ArrayList<Integer>();
        ArrayList<Double> myDoubleList = new ArrayList<Double>();

        for(int i = 0;i<=10;i++){
            myIntList.add(Integer.valueOf(i*5));
        }
        for(int i = 0;i<myIntList.size();i++){
            System.out.println(i+ " ==> "+myIntList.get(i).intValue());
        }
        for(double i = 0.0;i<=10.0;i+=0.5){
            myDoubleList.add(i);
        }
        System.out.println();
        for(int i = 0;i<=10;i+=1){

            System.out.println(i +" ==> "+ myDoubleList.get(i));
        }
    }
}
