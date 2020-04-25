package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isValid(char[] walk) {
        int minutes = 10;
        int[] position = {0, 0};
        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n') {
                position[1]++;
                minutes--;
            }
            if (walk[i] == 's') {
                position[1]--;
                minutes--;
            }
            if (walk[i] == 'w') {
                position[0]--;
                minutes--;
            }
            if (walk[i] == 'e') {
                position[0]++;
                minutes--;
            }
        }
        return (minutes==0 & position[0]==0 & position[1] == 0);
    }


}

