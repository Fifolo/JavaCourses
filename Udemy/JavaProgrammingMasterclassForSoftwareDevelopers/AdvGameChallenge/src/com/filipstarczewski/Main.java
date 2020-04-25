package com.filipstarczewski;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static HashMap<Integer, Location> world = new HashMap<>();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        world.put(0, new Location(0, "You are in front of the Computer"));
        world.put(1, new Location(1, "You are on the Road"));
        world.put(2, new Location(2, "You are on the Hill"));
        world.put(3, new Location(3, "You are in the Building"));
        world.put(4, new Location(4, "You are in the Valley"));
        world.put(5, new Location(5, "You are in the Forest"));

        world.get(1).addExit("W", 2);
        world.get(1).addExit("E", 3);
        world.get(1).addExit("S", 4);
        world.get(1).addExit("N", 5);

        world.get(2).addExit("N", 5);

        world.get(3).addExit("W", 1);

        world.get(4).addExit("N", 1);
        world.get(4).addExit("W", 2);

        world.get(5).addExit("S", 1);
        world.get(5).addExit("W", 2);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");

        int currentLocation = 1;
        mainLoop:
        while (true) {

            System.out.println(world.get(currentLocation).getDescription() + "\n");
            if (currentLocation == 0) break;

            Map<String, Integer> exits = world.get(currentLocation).getExits();
            System.out.println("Available exits:");
            for (String dir : exits.keySet()) {
                System.out.print(dir + " ");
            }

            System.out.println("\nGive me a direction");
            String direction = s.nextLine();

            if (direction.length() == 1 && exits.containsKey(direction.toUpperCase())) {
                currentLocation = exits.get(direction.toUpperCase());
                continue;
            }
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String w : words) {
                    w = w.toUpperCase();
                    if (vocabulary.containsKey(w)) {
                        direction = vocabulary.get(w);
                        currentLocation = exits.get(direction.toUpperCase());
                        continue mainLoop;
                    }
                }
            }
            System.out.println("Wrong direction");
        }

    }
}
