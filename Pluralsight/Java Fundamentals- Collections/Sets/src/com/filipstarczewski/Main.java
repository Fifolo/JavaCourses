package com.filipstarczewski;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static final Set<Product> products = new TreeSet<>(Product.BY_NAME);

    public static void main(String[] args) {
        Product chair = new Product(12, "Chair");
        Product door = new Product(13, "chair");
        Product mouse = new Product(15, "Mouse");
        Product glass = new Product(16, "Glass");

        products.add(chair);
        products.add(door);
        products.add(mouse);
        products.add(glass);
        

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
