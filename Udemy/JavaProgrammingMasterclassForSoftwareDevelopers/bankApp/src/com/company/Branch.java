package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double initialAmount) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name, initialAmount));
            return true;
        } else {
            System.out.println("Customer already exists");
            return false;
        }
    }

    public boolean addCustomerTransaction(String name, double amount) {
        if (findCustomer(name) == null) {
            return false;
        } else {
            findCustomer(name).addTransaction(amount);
            return true;
        }
    }

    public void listCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).getName());
            customers.get(i).printTransactions();
        }
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName))
                return customers.get(i);
        }
        return null;
    }
}
