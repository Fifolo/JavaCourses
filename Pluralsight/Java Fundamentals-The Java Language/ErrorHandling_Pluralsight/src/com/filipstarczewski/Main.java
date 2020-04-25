package com.filipstarczewski;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
      //  readFile("C:\\Users\\filip\\Desktop\\numbers.txt");
        try {
            calculate(1, 2);
        }catch (FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void calculate(int a, int b) throws FileNotFoundException {
        FileReader fileReader = new FileReader("C:\\Users\\filip\\Desktop\\gufno.txt");
        System.out.println("Result: " + (a + b));
    }

    public static void readFile(String fileName) {
        int sum = 0;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {

                String[] values = line.split(" ");
                System.out.print("Line: ");

                for (int k = 0; k < values.length; k++) {
                    try {
                        System.out.print(values[k] + " ");
                        sum += Integer.parseInt(values[k]);
                    } catch (Exception e) {
                        System.out.println("\nError: " + e.getMessage());
                    }
                }
                System.out.println("\nSum = " + sum + "\n");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
