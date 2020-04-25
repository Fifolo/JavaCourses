package com.starczi;

public class Samsung extends MobilePhone {
    public Samsung(String myNumber) {
        super(myNumber);
    }

    @Override
    public boolean updateContact(Contacts currentContact, Contacts newContact) {
        return super.updateContact(currentContact, newContact);
    }

    @Override
    public boolean addContact(Contacts contacts) {
        return super.addContact(contacts);
    }

    @Override
    public String contactName(Contacts contacts) {
        return super.contactName(contacts);
    }

    @Override
    public Contacts contactName(String name) {
        return super.contactName(name);
    }

    @Override
    public void printContacts() {
        super.printContacts();
    }

    @Override
    public boolean removeContact(Contacts contacts) {
        return super.removeContact(contacts);
    }
}
