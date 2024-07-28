package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<String>());
        run(new LinkedHashSet<String>());
        run(new TreeSet<String>());
    }

    private static void run(Set<String> set){
        System.out.println(set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("2");
        set.add("1");

        Iterator<String> iterator = set.iterator();//반복자 객체 반환
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
