package collection.compare.test1;

import java.util.*;
import static collection.compare.test1.CardGameSpecification.*;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (int i = CARD_NUM_START; i < CARD_NUM_END+1; i++) {
            cards.add(new Card(i,CARD_SHAPE_SPADE));
            cards.add(new Card(i,CARD_SHAPE_HEART));
            cards.add(new Card(i,CARD_SHAPE_DIAMOND));
            cards.add(new Card(i,CARD_SHAPE_CLOVER));
        }
    }

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle(){//카드를 랜덤하게 섞음.
        Collections.shuffle(cards);
    }

    public Card getCard(int index) {
        return cards.get(index);
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getSum(){
        int sum = 0;
        for (Card card : cards) {
            sum += card.getNum();
        }
        return sum;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
