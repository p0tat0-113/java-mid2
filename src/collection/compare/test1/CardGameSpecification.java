package collection.compare.test1;

import java.util.List;

public class CardGameSpecification {
    public static final int CARD_NUM_START = 1;
    public static final int CARD_NUM_END = 13;
    public static final int TOTAL_SHAPE_AMOUNT = 4;
    public static final int TOTAL_CARDS_AMOUNT = CARD_NUM_END * TOTAL_SHAPE_AMOUNT;

    public static final String CARD_SHAPE_SPADE = "♠";
    public static final String CARD_SHAPE_HEART = "♥";
    public static final String CARD_SHAPE_DIAMOND = "♦";
    public static final String CARD_SHAPE_CLOVER = "♣";
    public static final List<String> CARD_SHAPE_ORDER = List.of(CARD_SHAPE_SPADE,CARD_SHAPE_HEART,CARD_SHAPE_DIAMOND,CARD_SHAPE_CLOVER);//문양의 정렬 순서

    public static final int PLAYER_CARD_AMOUNT = 5;
}
