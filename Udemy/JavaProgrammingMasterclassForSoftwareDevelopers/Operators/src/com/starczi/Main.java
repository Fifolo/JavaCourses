package com.starczi;

public class Main {

    public static void main(String[] args) {
       /* int topScore = 100;
        if (topScore>50 && topScore<150)
            System.out.println("Your score is beetwen 50 and 150");
        int secondScore= 80;
        if(topScore>50 && secondScore<topScore)
            System.out.println(secondScore);
*/

        double first = 20;
        double second = 80;
        double result = (first+second)*25;
        System.out.println(result);
        double remainder = result % 40;
        System.out.println(remainder);
        if(remainder<=20)
            System.out.println("Remaining value is 20 or less");

    }
}
