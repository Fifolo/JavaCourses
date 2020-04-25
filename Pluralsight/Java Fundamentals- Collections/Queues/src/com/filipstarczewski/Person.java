package com.filipstarczewski;

import java.util.Comparator;

public class Person {
    private final String name;
    private final Position position;
    private final int age;

   public static final Comparator<Person> BY_POSITION = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getPosition().compareTo(o2.getPosition());
        }
    };

    public Person(String name, int age, Position position) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }
}
