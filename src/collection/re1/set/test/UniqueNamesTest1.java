package collection.re1.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(List.of(30, 20, 20, 10, 10));
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
