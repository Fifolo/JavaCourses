package com.filipstarczewski;

import java.util.Comparator;

public class Thing {
    private int weigth;
    private String name;

    private static final Comparator<Thing> BY_WEIGHT = new Comparator<Thing>() {
        @Override
        public int compare(Thing o1, Thing o2) {
            return Integer.compare(o1.getWeigth(), o2.getWeigth());
        }
    };

    public Thing(int weigth, String name) {
        this.weigth = weigth;
        this.name = name;
    }

    public static Comparator<Thing> getByWeight() {
        return BY_WEIGHT;
    }

    public int getWeigth() {
        return weigth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "weight=" + weigth +
                ", name='" + name + '\'' +
                '}';
    }
}
