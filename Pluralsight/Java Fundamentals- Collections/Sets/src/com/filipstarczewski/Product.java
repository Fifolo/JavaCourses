package com.filipstarczewski;

import java.util.Comparator;
import java.util.Objects;

public class Product
        //implements Comparable<Product>
{
    private final int value;
    private final String name;
    public static Comparator<Product> BY_NAME = new Comparator<>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().toLowerCase().compareTo(o2.name.toLowerCase());
        }
    };

    public Product(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public int compareTo(Product o) {
//        return this.name.compareTo(o.name);
//    }

    @Override
    public String toString() {
        return "Product{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return value == product.value &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, name);
    }
}
