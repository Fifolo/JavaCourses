package com.starczi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                     quit = true;
                     break;

            }
        }
    }
    public static void addItem(){
        System.out.print("Enter an item to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter current item");
        String currentItem = scanner.nextLine();
        System.out.println("Enter replacement item");
        groceryList.modifyItem(currentItem,scanner.nextLine());
    }
    public static void removeItem(){
        System.out.println("Enter item to remove");
        groceryList.removeGroceryItem(scanner.nextLine());
    }
    public static void searchItem(){
        System.out.println("Enter item to find");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println(searchItem+ " found");
        }
        else System.out.println(searchItem+ " not in array");

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list.");
        System.out.println("\t 2 - To add an item.");
        System.out.println("\t 3 - To modify the item.");
        System.out.println("\t 4 - To remove an item.");
        System.out.println("\t 5 - To search for an item.");
        System.out.println("\t 6 - To quit.");
    }
    public static void copyArray(){
        ArrayList<String> newArray= new ArrayList<String>(groceryList.getGroceryList());
    }
}
