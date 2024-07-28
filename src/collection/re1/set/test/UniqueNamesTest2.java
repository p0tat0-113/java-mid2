package collection.re1.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>(List.of(30, 20, 20, 10, 10));
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
