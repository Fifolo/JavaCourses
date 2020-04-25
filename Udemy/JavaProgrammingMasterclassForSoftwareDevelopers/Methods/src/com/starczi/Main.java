package com.starczi;

public class Main {

    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Filip", position);
        position = calculateHighScorePosition(750);
        displayHighScorePosition("Kuba", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Marek", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Bartek", position);

        //calculateScore(true, 800, 5, 10);

        //   calculateScore(true, 1500, 10, 5);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500)
            position = 2;
        else if (score >= 100)
            position = 3;
        return position;
    }
}

    /*public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final Score is " + finalScore);
            return finalScore;
        }
        return -1;
        }*/




