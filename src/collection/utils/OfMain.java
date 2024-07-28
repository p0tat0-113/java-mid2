package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 컬렉션 생성, .of()를 쓰는건 다 불변이라고 생각하면 됨. 날짜 객체들도 그랬었음.

        List<Integer> list = List.of(1, 2, 3, 4, 5);//불변 컬렉션이 생성됨.
        Set<Integer> set = Set.of(1,2,3,4,5);//값을 중복되게 넣으면 IllegalArgumentException: duplicate element 예외 발생
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        //ImmutableCollections 안에 있는 중첩 클래스들이 찍힘
        System.out.println("list.getClass() = " + list.getClass());
        System.out.println("set.getClass() = " + set.getClass());
        System.out.println("map.getClass() = " + map.getClass());

        //불변 리스트를 변경하려고 시도시 예외 발생함.
        list.add(1);
    }
}
