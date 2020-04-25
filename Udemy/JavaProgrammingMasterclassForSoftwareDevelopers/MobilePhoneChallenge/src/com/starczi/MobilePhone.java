package com.starczi;

import java.util.ArrayList;

//new Contacts(name,number)
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean updateContact(Contacts currentContact, Contacts newContact) {
        int position = findContact(currentContact);
        if (position < 0) {
            System.out.println(currentContact.getName() + ", not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println(newContact.getName() + " already exists, update unsuccesful");
            return false;
        } else {
            this.myContacts.set(position, newContact);
            System.out.println(currentContact.getName() + " was replaced with " + newContact.getName());
            return true;
        }
    }

    public boolean addContact(Contacts contacts) {
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("Contact already in");
            return false;
        } else {
            myContacts.add(contacts);
            return true;
        }

    }

    private int findContact(Contacts contacts) {
        return this.myContacts.indexOf(contacts);
    }

    public String contactName(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            return contacts.getName();
        }
        return null;
    }

    public Contacts contactName(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }


    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
            return -1;

    }

    public void printContacts() {
        System.out.println("You have " + myContacts.size() + " contacts ");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println("Position " + i + " ==> " + myContacts.get(i).getName()
                    + " " + myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean removeContact(Contacts contacts) {
        int position = findContact(contacts);
        if (position < 0) {
            System.out.println(contacts.getName() + ", not found");
            return false;
        }
        myContacts.remove(position);
        System.out.println(contacts.getName() + " was removed");
        return true;
    }

}
