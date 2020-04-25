package com.starczi;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("Position: " + i + " ==> " + groceryList.get(i));
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void modifyItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position>=0){
            modifyItem(position,newItem);
        }
    }

    private void modifyItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }
    public void removeGroceryItem(String currentItem){
        int position = findItem(currentItem);
        if(position>=0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String item) {
        return groceryList.indexOf(item);
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0)return  true;
        return false;
    }
}
