package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>(List.of(user1, user2, user3));

        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null);//별도의 Comparator를 넣지 않음.
        Collections.sort(list);//Collections.sort()를 쓸 수도 있음. 권장하지는 않음. 객체가 자기 데이터를 가지고 스스로 정렬하는게 더 객체지향적
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
        Collections.sort(list, new IdComparator());//Collections.sort()를 쓸 수도 있음. 권장하지는 않음.
        System.out.println(list);

    }
}
