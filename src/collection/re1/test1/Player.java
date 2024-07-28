package collection.re1.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
        cards = new ArrayList<>();
    }

    public void draw(Deck deck){
        for (int i = 0; i < 5; i++) {
            cards.add(deck.draw());
        }
    }

    public List<Card> showHand(){
        cards.sort(null);//자연순서로 정렬
        return cards;
    }

    public Integer getSum(){
        int sum = 0;
        for (Card card : cards) {
            sum += card.getNumber();
        }
        return sum;
    }

    public String getName() {
        return name;
    }
}
