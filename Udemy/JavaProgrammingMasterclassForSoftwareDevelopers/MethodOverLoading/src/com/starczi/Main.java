package com.starczi;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5,12);
        calcFeetAndInchesToCentimeters(50);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
        if (feet < 0 || inch < 0 || inch > 12) {
            System.out.println("Invalid number");
            return -1;
        } else {
            double cm = (inch + (feet * 12))*2.54;
            System.out.println(feet+" feet and "+inch+" inches equals "+cm+" centimeters");
            return cm;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inch){
        if(inch<0){
            return -1;
        }
        else{
            double feet=(int)inch/12;
            double remainingInches=(int)inch%12;
            System.out.println(inch+" inches is equal to "+feet+" feet and "+remainingInches+" inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
    }

}
