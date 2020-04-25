package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        } else {
            System.out.println("Branch already exists");
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        if (findBranch(branchName) == null) {
            System.out.println("That branch does not exist");
            return false;
        } else {
            findBranch(branchName).addCustomer(customerName, initialAmount);
            return true;
        }
    }

    public boolean addCustomerTransaction(String branchName, String name, double amount) {
        if (findBranch(branchName) != null) {
            findBranch(branchName).addCustomerTransaction(name, amount);
            return true;
        } else {
            System.out.println("Wrong branch name");
            return false;
        }
    }

    public void listCustomers() {
        for (int i = 0; i < branches.size(); i++) {
            System.out.println(branches.get(i).getBranchName());
            System.out.println("");
            branches.get(i).listCustomers();
            System.out.println("\n ");
        }
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName))
                return branches.get(i);
        }
        return null;
    }
}
