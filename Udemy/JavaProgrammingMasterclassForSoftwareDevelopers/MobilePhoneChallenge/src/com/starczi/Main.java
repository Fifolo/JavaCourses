package com.starczi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123431423");

    public static void main(String[] args) {
        boolean run = true;
        startPhone();
        printOptions();
        while (run) {
            System.out.println("Write your choice ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    System.out.println("Turning phone off...");
                    run = false;
            }
        }
    }

    public static void printOptions() {
        System.out.println(" 0 ==> print options" +
                "\n 1 ==> print contacts" +
                "\n 2 ==> add contact" +
                "\n 3 ==> remove contact" +
                "\n 4 ==> modify contact" +
                "\n 5 ==> find contact" +
                "\n 6 ==> exit");
    }

    public static void startPhone() {
        System.out.println("Starting phone...");
    }

    public static void printContacts() {
        mobilePhone.printContacts();
    }

    public static void addContact() {
        System.out.println("Enter name ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phoneNumber);
        if (mobilePhone.addContact(newContact)) {
            System.out.println(newContact.getName() + " succesfuly added to list");
        } else {
            System.out.println("Can't add, that name already exists");
        }
    }

    public static void removeContact() {
        System.out.println("Enter existing name");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.contactName(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
        }
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Contact deleted");
        } else {
            System.out.println("Error deleting an contact");
        }
    }

    public static void modifyContact() {
        System.out.println("Enter existing name");
        String currentName = scanner.nextLine();
        Contacts existingContact = mobilePhone.contactName(currentName);
        if (existingContact == null) {
            System.out.println("Contact not found");
        }
        System.out.println("Enter new contact name ");
        String newName = scanner.nextLine();
        System.out.println("Enter number");
        String number = scanner.nextLine();
        Contacts newContact = new Contacts(newName, number);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Succesfuly modified contact");
        } else {
            System.out.println("Error while modifing contact");
        }
    }

    public static void findContact() {
        System.out.println("Enter existing name");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.contactName(name);
        if (existingContact != null) {
            System.out.println(existingContact.getName() + " exists with number " + existingContact.getPhoneNumber());
        } else {
            System.out.println("Couldn't find that contact");
        }
    }
}
