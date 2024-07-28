package collection.re1.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;

    public Deck() {
        initDeck();
    }

    private void initDeck(){
        deck = new ArrayList<Card>();
        for (int i = 1; i <= 13; i++) {
            for (Symbol symbol : Symbol.values()) {
                deck.add(new Card(i, symbol));
            }
        }
        Collections.shuffle(deck);
    }

    public Card draw(){
        Card card = deck.getFirst();
        deck.removeFirst();
        return card;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }

    public static void main(String[] args) {
        Deck deck1 = new Deck();
        deck1.initDeck();
        System.out.println(deck1);
    }
}
