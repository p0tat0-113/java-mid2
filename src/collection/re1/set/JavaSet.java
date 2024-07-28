package collection.re1.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();//순서 미보장
        Set<String> set2 = new LinkedHashSet<>();//입력 순서 보장
        Set<String> set3 = new TreeSet<>();//데이터를 기준으로 정렬, 이진 탐색 트리 구조 사용, O(log n)

        run(set1);
        run(set2);
        run(set3);

        //TreeSet은 데이터를 넣을 때부터 내부적으로 계속 비교를 하면서 정렬한다. 그래서 TreeSet에 넣으려면 반드시 Comparable을 구현해야 한다.
        TreeSet<Member1> members = new TreeSet<>();
        members.add(new Member1("3"));
        members.add(new Member1("1"));
        members.add(new Member1("C"));
        members.add(new Member1("B"));
        System.out.println(members);

        /*==자바가 제공하는 Set의 최적화==

        앞에서도 배웠듯이 입력된 데이터의 양이 해시 자료구조 배열 크기의 75%를 넘어가면, 해시충돌이 잦아지면서 검색 성능이 떨어진다.
        그래서 자바가 제공하는 HashSet은 이럴 때마다 배열의 크기를 2배 늘리고, 늘어난 배열 크기에 맞춰서 데이터들의 해시 인덱스를 다시 계산해서
        다시 적용하는 리해싱을 한다. 리해싱을 하는데 시간이 소요되긴 하지만 그래도 덕분에 빠른 검색 성능을 유지할 수 있음.

        그리고 모든 해시충돌이 많이 발생해서, 한 버킷 안에 여러 데이터들이 들어간 상황도 자동으로 감지해서 버킷을 이진탐색트리 구조로
        바꿔버린다고 한다. 덕분에 최악의 상황에도 O(log n)의 성능을 보장함.*/
    }

    private static void run(Set<String> set){
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("2");
        set.add("1");
        System.out.println(set);
    }
}
