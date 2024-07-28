package collection.compare.test2;

import java.util.ArrayList;
import java.util.List;
import static collection.compare.test2.CardGameSpecification.*;

public class Player {

    private String name;

    private Deck deck;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public void draw(Deck deck){//덱을 받아서 5장을 뽑아 손에 쥠.
        this.deck = deck;

        for (int i = 0; i < PLAYER_HAND_CAPACITY; i++) {
            hand.add(deck.draw());//덱에서 카드를 한 장 뽑아서 손에 쥠.
        }

        hand.sort(null);//자연 순서대로 정렬, Card에서 구현한 Comparable을 사용해서 정렬
    }

    public void showHand(){
        System.out.println(name + ": " + hand + ", 총합: " + getSum());
    }

    public String getName() {
        return name;
    }

    public int getSum(){
        int sum = 0;
        for (Card card : hand) {
            sum += card.getNum();
        }
        return sum;
    }
}
