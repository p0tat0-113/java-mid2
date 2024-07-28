package collection.compare.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import static collection.compare.test1.CardGameSpecification.*;

public class Player {
    private Deck deck;

    public void getDeck(Deck deck){
        this.deck = deck;
    }

    public Deck pickAndShow(){
        List<Card> pickedCards = new ArrayList<>();

        List<Integer> randomIndex = getRandomIndex();
        for (Integer index : randomIndex) {
            pickedCards.add(deck.getCard(index));
        }

        pickedCards.sort(null);//자연 순서로 정렬

        return new Deck(pickedCards);
    }

    private List<Integer> getRandomIndex(){//52장의 카드 중 어떤 카드 5장을 뽑을지 인덱스를 랜덤하게 고름
        Random random = new Random();
        TreeSet<Integer> indexTreeSet = new TreeSet<>();

        while(indexTreeSet.size() < PLAYER_CARD_AMOUNT){
            int index = random.nextInt(0,TOTAL_CARDS_AMOUNT);
            indexTreeSet.add(index);
        }

        return new ArrayList<>(indexTreeSet);
    }
}
