package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortMain {
    public static void main(String[] args) {

        //변수 타입을 굳이 List로 하는 이유: 이렇게 하면 나중에 구현체를 LinkedList로 바꾼다던가 할 때 코드를 수정할 부분이 여기 한 곳으로 줄어들음.
        //다만 ArrayList가 가지고 있는 좀 더 구체적인 기능을 못 쓰는게 단점일 수 있음. 상황에 따라 알잘딱 하면 된다고 함.
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        //Collections는 콜렉션을 위한 여러가지 유틸리티 메서드를 제공한다.
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);

        Collections.shuffle(list);//list를 랜덤하게 섞어버림
        System.out.println("shuffle list = " + list);

        Collections.sort(list);//list.sort()를 더 권장
        System.out.println("sort list = " + list);

        Collections.reverse(list);//반전시킴
        System.out.println("reverse list = " + list);
    }
}
