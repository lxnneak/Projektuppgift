package se.linnea.diceGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Välkommen till spelet");

        // 2 players skapas, name från metod askName(), score = 0 till att börja med
        Player player1 = new Player(askName(1), 0);
        Player player2 = new Player(askName(2), 0);

        // spelarna slår tärningen varannan gång, 2 ggr
        for (int i = 0; i < 2; i++) {
            player1.rollDice();
            player2.rollDice();
        }

        // visar totala poängen
        player1.displayScore();
        player2.displayScore();

        // jämför poängen och visar vinnare
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Vinnare: " + player1.getName());
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Vinnare: " + player2.getName());
        } else {
            System.out.println("Oavgjort!");
        }

    }


    // frågar efter och returnerar spelarens namn
    // player nr skickas med från main och skrivs ut så att man vet vilken spelare det gäller
    public static String askName(int player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange namn för spelare " + player);
        return sc.nextLine();
    }
}
