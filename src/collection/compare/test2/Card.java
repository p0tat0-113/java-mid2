package collection.compare.test2;

//숫자와 문양을 가지고 있는 카드 객체

public class Card implements Comparable<Card>{//정렬할 수 있게 Comparable을 구현함.

    //카드의 숫자와 문양은 변할 일이 없으므로 final로 선언함.
    private final Integer num;
    private final Shape shape;

    public Card(Integer num, Shape shape) {
        this.num = num;
        this.shape = shape;
    }

    public Integer getNum() {
        return num;
    }

    public Shape getShape() {
        return shape;
    }

    @Override
    public int compareTo(Card o) {
        if (num.equals(o.num)){//숫자가 같으면 문양으로 비교해야함.
            return shape.compareTo(o.shape);//Shape enum의 ordinal, 즉 선언 순서로 비교한다. Enum클래스가 이미 ordinal로 비교하도록 Comparable을 구현해뒀음.
            //스페이드, 하트 등의 문양의 순서는 변하지 않는다고 가정하고, ENUM의 기본 순서를 사용한 것
        } else {
            return num.compareTo(o.num);
            //Integer.compareTo() 정적 메서드를 써도 된다.
        }
    }

    @Override
    public String toString() {
        return num+"("+shape+")";
    }
}
