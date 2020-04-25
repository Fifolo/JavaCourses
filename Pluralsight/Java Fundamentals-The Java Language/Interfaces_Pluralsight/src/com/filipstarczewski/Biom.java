package com.filipstarczewski;

import java.util.Random;

public class Biom implements Comparable<Biom> {
    private final int ID;
    private final int konsy;
    private final int puchy;

    public Biom(int ID) {
        Random r = new Random();
        this.ID = ID;
        this.konsy = r.nextInt(10);
        this.puchy = r.nextInt(10);
    }

    @Override
    public String toString() {
        return "Biom{" +
                "ID=" + ID +
                ", konsy=" + konsy +
                ", puchy=" + puchy +
                '}';
    }

    public int getKonsy() {
        return konsy;
    }

    public int getPuchy() {
        return puchy;
    }

    @Override
    public int compareTo(Biom o) {
        if (this.konsy > o.getKonsy()) return -1;
        else if (this.konsy < o.getKonsy()) return 1;
        else {
            return Integer.compare(o.getPuchy(), this.puchy);
        }
    }

}
