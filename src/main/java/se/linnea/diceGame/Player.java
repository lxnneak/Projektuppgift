package se.linnea.diceGame;

import java.util.Random;

public class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void rollDice() {
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        this.score += roll;
        System.out.println("Du kastade: " + roll);
        System.out.println();
    }
}
