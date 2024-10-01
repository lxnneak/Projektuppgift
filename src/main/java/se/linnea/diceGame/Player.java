package se.linnea.diceGame;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private int score;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public Player(String name, int score) { //constructor
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
        System.out.println(this.getName() + ", tryck enter för att slå tärningen"); // låter spelaren interagera med spelet
        String input = scanner.nextLine();  // input används ej, spelet väntar på spelaren innan det fortsätter

        int roll = random.nextInt(6) + 1; // tärningen slås
        this.score += roll; // kastet adderas till spelarens score

        System.out.println("Du kastade: " + roll); // skriver ut det nuvarande kastet
        System.out.println();
    }

    public void displayScore() {
        System.out.println(this.getName() + " fick " + this.getScore() + " poäng");
    }
}
