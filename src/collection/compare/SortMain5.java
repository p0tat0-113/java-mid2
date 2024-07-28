package collection.compare;

import java.util.*;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        //TreeSet은 이진 탐색 트리. 데이터를 넣을 때부터 정렬한다.
        Set<MyUser> treeSet1 = new TreeSet<>(List.of(user1, user2, user3));

        System.out.println("Comparable 기본 정렬");
        //MyUser에서 구현한 Comparable을 가지고 정렬한다.
        System.out.println(treeSet1);

        //이렇게 TreeSet의 생성자에 Comparator를 넣어주면 데이터가 입력될 때 이것을 기준으로 데이터를 정렬한다.
        Set<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(user1);
        treeSet2.add(user2);
        treeSet2.add(user3);

        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);

        //TreeSet은 데이터를 넣은 과정에서부터 비교를 하기 때문에, Comparable 구현이나 Comparator가 필수다.
    }
}
