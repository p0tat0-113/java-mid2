package collection.compare.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static collection.compare.test2.CardGameSpecification.*;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initCard();
    }

    private void initCard(){
        for (int i = CARD_NUM_START; i <= CARD_NUM_END; i++) {
            for (Shape shape : Shape.values()) {//shape enum 인스턴스를 배열로 받음
                cards.add(new Card(i,shape));
            }
        }
    }

    public void shuffle(){//카드를 랜덤하게 섞음. Collections.shuffle() 사용
        Collections.shuffle(cards);
    }

    public Card draw(){
        return cards.remove(0);//맨 앞의 카드를 한 장 뽑아서 반환.
        //지금처럼 데이터가 적을 때는 ArrayList도 앞에서 빼도 딱히 상관없다.
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
