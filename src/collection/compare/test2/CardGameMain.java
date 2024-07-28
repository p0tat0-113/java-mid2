package collection.compare.test2;

import java.util.ArrayList;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        player1.draw(deck);
        player2.draw(deck);

        player1.showHand();
        player2.showHand();

        whoIsWinner(player1,player2);
    }

    private static void whoIsWinner(Player player1, Player player2){
        int player1Sum = player1.getSum();
        int player2Sum = player2.getSum();

        if (player1Sum > player2Sum) {
            System.out.println("플레이어1 승리");
        } else if (player1Sum < player2Sum) {
            System.out.println("플레이어2 승리");
        } else {
            System.out.println("무승부");
        }
    }
}
