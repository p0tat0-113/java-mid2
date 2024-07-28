package collection.re1.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
        //코드 작성

        //합집합
        HashSet<Integer> setA = new HashSet<>(set1);
        setA.addAll(set2);
        System.out.println(setA);

        //교집합
        HashSet<Integer> setB = new HashSet<>(set1);
        setB.retainAll(set2);
        System.out.println(setB);

        //차집합
        HashSet<Integer> setC = new HashSet<>(set1);
        setC.removeAll(set2);
        System.out.println(setC);
    }
}
