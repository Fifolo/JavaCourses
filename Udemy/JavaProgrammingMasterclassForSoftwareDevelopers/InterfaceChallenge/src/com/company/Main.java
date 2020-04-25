package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player filip = new Player("Flip",100,75,"Staff");
        Player ola = new Player("Ola", 70,100,"Wand");

        System.out.println(filip.toString());
        System.out.println(ola.toString());

        saveObject(filip);
        saveObject(ola);

        loadObject(filip);
        System.out.println(filip.toString());

    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        Scanner s = new Scanner(System.in);
        List<String> values = new ArrayList<>();

        System.out.println("Enter name ");
        String name = s.nextLine();
        values.add(name);

        System.out.println("Enter HP ");
        int hp = s.nextInt();
        s.nextLine();
        values.add(String.valueOf(hp));

        System.out.println("Enter mana ");
        int mana = s.nextInt();
        s.nextLine();
        values.add(String.valueOf(mana));

        System.out.println("Enter weapon ");
        String weapon = s.nextLine();
        values.add(weapon);

        objectToLoad.read(values);
    }
}
