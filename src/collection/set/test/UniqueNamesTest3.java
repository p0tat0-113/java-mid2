package collection.set.test;

/*문제 설명
여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
데이터의 값 순서로 출력해라.
출력 예): 10, 20, 30*/

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        //정렬된 데이터의 값 순서대로 출력하기 위해서 TreeSet을 사용함.
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
