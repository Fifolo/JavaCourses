package com.filipstarczewski;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Product chair = new Product(1, "Chair", 20);
        Product book = new Product(2, "Book", 30);
        Product school = new Product(3, "School", 15);
        Product game = new Product(4, "Game", 80);

        final Product defaultProduct = new Product(-1, "Whatever u want", 50);

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(chair.getID(),chair);
        idToProduct.put(book.getID(),book);
        idToProduct.put(school.getID(),school);
        idToProduct.put(game.getID(),game);

//        Product result = idToProduct.getOrDefault(32,defaultProduct);
//        System.out.println(result);
        idToProduct.forEach((key,value)->{
            System.out.println(key + " -> "+value);
        });
C:\Program Files\Java\jdk-13.0.1\bin
    }
}
