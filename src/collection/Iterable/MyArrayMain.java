package collection.Iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {

        MyArray array = new MyArray(new int[]{1, 2, 3, 4});

        //만약 반복자가 없다면, ArrayList는 배열을 직접꺼내서, LinkedList TreeSet같은 애들은 노드를 직접 꺼내와서 접근해야 할 것이다.
        //순회하기가 너무 어렵고 힘들다.

        Iterator iterator = array.iterator();

        System.out.println("iterator 사용");
        while (iterator.hasNext()){
            System.out.println("value = "+iterator.next());
            //System.out.println("-------------------------");
        }

        //각 자료구조들이 Iterable과 Iterator를 내부적으로 다 구현을 해놓았다면
        //사용하는 사람 입장에서는 복잡한 내부구현은 신경 쓸 필요 없이, Iterator 인터페이스의 hasNext() next()메서드를 사용하면 된다.

        //추가
        System.out.println("for-each 사용 향상된 for문");
        //for-each문을 쓰려면, 배열이거나, Iterable을 구현해야만 한다.
        //자바는 컴파일 시점에 for-each문을 위 while 반복문 형태로 변경한다.
        for (Integer value : array) {
            System.out.println("value = "+value);
        }
    }
}
