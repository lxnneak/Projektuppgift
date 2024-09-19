package se.linnea.diceGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Välkommen till spelet");
        System.out.println("Ange namn för spelare 1");
        Player player1 = new Player(sc.nextLine(), 0);
        System.out.println("Ange namn för spelare 2");
        Player player2 = new Player(sc.nextLine(), 0);

        System.out.println(player1.getName() + ", tryck enter för att slå första kastet");
        String input = sc.nextLine();

        player1.rollDice();

        System.out.println(player2.getName() + ", tryck enter för att slå första kastet");
        input = sc.nextLine();

        player2.rollDice();

        System.out.println(player1.getName() + ", tryck enter för att slå andra kastet");
        input = sc.nextLine();

        player1.rollDice();

        System.out.println(player2.getName() + ", tryck enter för att slå andra kastet");
        input = sc.nextLine();

        player2.rollDice();

        System.out.println(player1.getName() + " fick " + player1.getScore() + "poäng");
        System.out.println(player2.getName() + " fick " + player2.getScore() + "poäng");

        if(player1.getScore() > player2.getScore()) {
            System.out.println("Vinnare: " + player1.getName());
        } else if(player1.getScore() < player2.getScore()) {
            System.out.println("Vinnare: " + player2.getName());
        } else {
            System.out.println("Oavgjort!");
        }
    }
}
