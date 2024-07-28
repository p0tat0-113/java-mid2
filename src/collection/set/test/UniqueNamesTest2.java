package collection.set.test;

/*문제 설명
여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
단 입력 순서대로 출력해라.
출력 예): 30, 20, 10*/


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        //입력 순서대로 출력하라고 해서 LinkedHashSet을 사용함.
        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(inputArr));//이렇게 배열을 리스트로 변환해서 집어넣는 식으로도 쓸 수 있음.

        /*for (Integer integer : inputArr) {
            linkedHashSet.add(integer);
        }*/

        for (Integer integer : linkedHashSet) {
            System.out.println(integer);
        }
    }
}
