package collection.re1.list;

import collection.re1.array.MyArrayList;
import collection.re1.link.MyLinkedList;

public class MyListMain1 {
    public static void main(String[] args) {

        MyList<Integer> list1 = new MyArrayList<>();
        MyList<Integer> list2 = new MyLinkedList<>();

        //리스트는 중복을 허용하고, 순서를 보장하는 자료구조이다.
        //사용자는 내부 구현이 어떻든 간에 신경쓸 것 없이 MyList인터페이스의 메서드를 통해서 일관성 있게 리스트 자료구조를 사용할 수 있다.

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list1);
        System.out.println(list2);

        for (Integer integer : list1) {
            System.out.println(integer);
        }
        for (Integer integer : list2) {
            System.out.println(integer);
        }
    }
}
