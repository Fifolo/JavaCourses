package com.company;

public class Main {

    public static void main(String[] args) {
        Bank ing = new Bank("ing");
        ing.addBranch("First");
        ing.addBranch("Second");
        ing.addCustomer("First", "Filip", 100);
        ing.addCustomer("First", "Kuba", 50);

        ing.addCustomer("Second", "Jacek", 300);
        ing.addCustomer("Second", "Placek", 70);

        ing.addCustomerTransaction("First", "Filip", 500);
        ing.addCustomerTransaction("First", "Filip", 300);
        ing.addCustomerTransaction("First", "Kuba", 1000);
        ing.listCustomers();
    }
}
