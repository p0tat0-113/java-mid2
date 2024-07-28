package collection.Iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        //자바의 컬렉션 프레임워크 구현체들은 모두 Iterable, Iterator인터페이스를 구현해두었다.
        //사용자는 해당 인터페이스의 메서드만 사용하면, 아주 쉽게 순회할 수 있다.

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        printAll(arrayList.iterator());
        forEach(arrayList);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        forEach(set);
    }

    //Iterator인터페이스 덕에 어떤 구현체이던지 다 받아서 실행시킬 수 있다. 재사용성을 극대화함.
    private static void printAll(Iterator<Integer> iterator){
        System.out.println("iterator: "+iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //Iterable은 Collection보다도 상위에 있는 인터페이스. Map을 제외한 모든 컬렉션을 받을 수 있다. 재사용성을 극대화함.
    private static void forEach(Iterable<Integer> iterable){
        System.out.println("iterator: "+iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }
    //Iterator, Iterable 은 인터페이스이다. 따라서 다형성을 적극 활용할 수 있다.
}
