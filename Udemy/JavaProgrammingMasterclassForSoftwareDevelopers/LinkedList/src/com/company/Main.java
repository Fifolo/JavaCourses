package com.company;

import java.util.*;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static ArrayList<Album> myAlbums = new ArrayList<Album>();
    private static LinkedList<Song> playlist = new LinkedList<Song>();

    public static void main(String[] args) {
        Song flip = new Song("Flip", 3.43);
        Song blackMambo = new Song("Black Mambo", 3.15);
        Song pools = new Song("Pools", 4.13);
        Song gooey = new Song("Gooey", 5.54);
        Song wallaWalla = new Song("Walla Walla", 2.49);
        Song toes = new Song("Toes", 3.05);
        Song wyrd = new Song("Wyrd", 3.35);

        Album glassAnimals = new Album("Glass Animals");
        glassAnimals.getSongs().add(flip);
        glassAnimals.getSongs().add(blackMambo);
        glassAnimals.getSongs().add(pools);
        glassAnimals.getSongs().add(gooey);
        glassAnimals.getSongs().add(wallaWalla);
        glassAnimals.getSongs().add(toes);
        glassAnimals.getSongs().add(wyrd);

        Song piwosz = new Song("Piwosz", 2.31);
        Song wodkosz = new Song("Wodkosz", 2.07);
        Song whiskosz = new Song("Whiskosz", 3.54);
        Song winiasz = new Song("Winiasz", 3.10);

        Album alkoholizm = new Album("Alkoholizm");
        alkoholizm.getSongs().add(piwosz);
        alkoholizm.getSongs().add(wodkosz);
        alkoholizm.getSongs().add(whiskosz);
        alkoholizm.getSongs().add(winiasz);

        myAlbums.add(glassAnimals);
        myAlbums.add(alkoholizm);

        playlist.add(myAlbums.get(0).getTrack("Flip"));
        playlist.add(myAlbums.get(0).getTrack("Wyrd"));
        playlist.add(myAlbums.get(1).getTrack("Piwosz"));
        playlist.add(myAlbums.get(0).getTrack("Gooey"));
        playlist.add(myAlbums.get(1).getTrack("Wodkosz"));

        printOptions();

        ListIterator<Song> listIterator = playlist.listIterator();
        boolean goingForward = true;
        boolean run = true;

        while (run) {
            System.out.println("Enter your choice: ");
            int decision = s.nextInt();
            s.nextLine();
            switch (decision) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Playing : " + listIterator.next().getName());
                    } else System.out.println("Reach the end of the list");
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Playing : " + listIterator.previous().getName());
                    } else System.out.println("You are already at the start");
                    break;
                case 3:
                    if (listIterator.hasPrevious()) {
                        System.out.println("Playing : " + listIterator.previous().getName());
                        listIterator.next();
                        goingForward = true;
                    } else if (listIterator.hasNext()) {
                        System.out.println("Playing : " + listIterator.next().getName());
                        listIterator.previous();
                        goingForward = false;
                    }
                    break;
                case 4:
                    listSongs();
                    break;
                case 5:
                    System.out.println("Ending program...");
                    run = false;
                    break;

                case 6:
                    System.out.println("Enter song to remove");
                    String name = s.nextLine();
                    while (listIterator.hasNext()) {
                        if (listIterator.next().getName().equals(name)) {
                            listIterator.remove();
                            goingForward = true;
                            System.out.println("Song removed");
                            break;
                        }
                    }
                    break;
            }
        }

    }

    private static void printOptions() {
        System.out.println("0 - printOptions" +
                "\n1 - playNext" +
                "\n2 - playPrevious" +
                "\n3 - replayCurrent" +
                "\n4 - listSongs" +
                "\n5 - finish" +
                "\n6 - remove song");
    }

    private static void listSongs() {
        Iterator<Song> i = playlist.iterator();
        while (i.hasNext()) {
            System.out.println(i.next().getName());
        }
    }
}
