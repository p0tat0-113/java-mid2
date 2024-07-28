package collection.compare.test1;

import static collection.compare.test1.CardGameSpecification.*;

//숫자와 문양을 가지고 있는 카드 객체

public class Card implements Comparable<Card>{//정렬할 수 있게 Comparable을 구현함.
    private Integer num;
    private String shape;

    public Card(Integer num, String shape) {
        this.num = num;
        this.shape = shape;
    }

    public Integer getNum() {
        return num;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public int compareTo(Card o) {
        if (num.equals(o.num)){//숫자가 같으면 문양으로 비교해야함.
            Integer shape1 = CARD_SHAPE_ORDER.indexOf(shape);
            Integer shape2 = CARD_SHAPE_ORDER.indexOf(o.shape);
            return shape1.compareTo(shape2);
        } else {
            return num.compareTo(o.num);
        }
    }

    @Override
    public String toString() {
        return num+"("+shape+")";
    }
}
