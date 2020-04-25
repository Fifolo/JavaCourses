package com.filipstarczewski;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    //   private static Queue<Person> people = new ArrayDeque<>();
    private static final Queue<Person> people = new PriorityQueue<>(Person.BY_POSITION);

    public static void main(String[] args) {
        Person jack = new Person("Jack", 40, Position.SUPPORTER);
        Person filip = new Person("Filip", 21, Position.PLAYER);
        Person mark = new Person("Mark", 30, Position.MANAGER);

        people.offer(jack);
        people.offer(filip);
        people.offer(mark);

        while (people.size() != 0) {
            System.out.println(people.remove());
        }
        stackCalculator("1+3+5");

    }

    public static void stackCalculator(String sequence) {
        Deque<String> stack = new ArrayDeque<>();
        String[] elements = sequence.split("");
        for (String element : elements) {
            System.out.print(element);
            stack.offer(element);
        }
        System.out.println(" ");
        int result = 0;
        while (stack.size() > 1) {
            int leftValue = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int rightValue = Integer.parseInt(stack.pop());
            switch (operator) {
                case "+":
                    result = leftValue + rightValue;
                    break;
                case "-":
                    result = leftValue - rightValue;
                    break;
            }
            stack.push(String.valueOf(result));
        }
        System.out.println("Result = " + result);
    }
}
