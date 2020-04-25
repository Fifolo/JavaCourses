package com.filipstarczewski;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Thing chair = new Thing(20, "Chair");
        Thing book = new Thing(4, "Book");
        Thing door = new Thing(40, "Door");
        Thing glass = new Thing(2, "Glass");

        Collection<Thing> things = new ArrayList<>();
        things.add(chair);
        things.add(book);
        things.add(door);
        things.add(glass);
//        System.out.println(things);
//
//        // when modyfying and element of the Collection, USE THE ITERATOR otherwise it will cause and error
//
//        Iterator<Thing> thingIterator = things.iterator();
//        while (thingIterator.hasNext()) {
//            Thing thing = thingIterator.next();
//            if (thing.getWeigth() < 10) {
//                System.out.println(thing);
//            } else {
//                System.out.println("Deleting " + thing.getName());
//                thingIterator.remove();
//            }
//        }
//        System.out.println(things);

        List<Thing> thingList = new ArrayList<>();
        thingList.add(chair);
        thingList.add(book);
        thingList.add(door);
        thingList.add(glass);
        System.out.println(thingList);
        thingList.sort(Thing.getByWeight());
        System.out.println("\n===\n" + thingList);

    }
}
