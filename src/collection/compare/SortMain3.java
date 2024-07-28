package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        MyUser[] users = {user1,user2,user3};

        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(users));

        System.out.println("Comparable 기본 정렬 - compareTo()이용");
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        //객체의 기본 정렬, 자연순서로 정렬하는 것이 아니라 다른 기준으로 정렬하고 싶으면 사용자가 직접 Comparator를 구현해서 넣으면 된다.
        System.out.println("IdComparator 정렬");
        Arrays.sort(users,new IdComparator());
        System.out.println(Arrays.toString(users));

        Arrays.sort(users,new IdComparator().reversed());//반대 방향으로
        System.out.println(Arrays.toString(users));
    }
}
