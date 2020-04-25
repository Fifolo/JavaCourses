package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int health;
    private int mana;
    private String weapon;

    public Player(String name, int health, int mana, String weapon) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> dane = new ArrayList<>();
        dane.add(this.name);
        dane.add(String.valueOf(this.health));
        dane.add(String.valueOf(this.mana));
        dane.add(this.weapon);
        return dane;
    }

    @Override
    public void read(List<String> savedValues) {
         if(savedValues.size()>0 && savedValues !=null){
             this.name = savedValues.get(0);
             this.health = Integer.parseInt(savedValues.get(1));
             this.mana = Integer.parseInt(savedValues.get(2));
             this.weapon = savedValues.get(3);
         }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
