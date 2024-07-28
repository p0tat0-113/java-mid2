package collection.set;

import java.util.LinkedHashSet;

public class MyHashSetV3Main {
    public static void main(String[] args) {

        //제네릭을 도입해서 타입 안정성이 높아짐.
        MySet<String> set = new MyHashSetV3<>(10);

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);

        //검색
        boolean result = set.contains("SET");
        System.out.println("result = " + result);

        //삭제
        set.remove("SET");
        System.out.println(set);
    }
}
