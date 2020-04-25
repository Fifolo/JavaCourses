package com.filipstarczewski;

public class Product {

    private final int ID;
    private final String name;
    private final int value;

    public Product(int ID, String name, int value) {
        this.ID = ID;
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public int getID() {
        return ID;
    }
}
