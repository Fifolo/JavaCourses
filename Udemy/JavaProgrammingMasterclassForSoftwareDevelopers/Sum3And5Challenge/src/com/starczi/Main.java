package com.starczi;

public class Main {

    public static void main(String[] args) {
        int numbers=0;
        int sum=0;
        for(int i=1;i<=1000;i++){
            if(i%(3*5)==0){
                numbers++;
                sum+=i;
                System.out.println("Found number = "+i);
            }

            if(numbers==5){

                break;
            }
        }
        System.out.println("Sum equals = "+sum);

    }
}
