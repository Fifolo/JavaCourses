package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        transactions.add(initialAmount);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void printTransactions() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("T" + (i + 1) + " = " + transactions.get(i));
        }
    }
}
