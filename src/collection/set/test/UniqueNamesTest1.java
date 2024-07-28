package collection.set.test;

/*문제 설명
여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다. 출력 순서는 관계없다.
출력 예): 30, 20, 10 또는 10, 20, 30 또는 20, 10, 30등과 같이 출력 순서는 관계 없다.*/

import java.util.HashSet;

public class UniqueNamesTest1 {
    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};

        //출력 순서는 관계 없다고 했기 때문에 HashSet을 사용함.
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : inputArr) {
            set.add(integer);//O(1)의 속도로 중복을 검사하고 데이터를 추가
        }
        for (Integer integer : set) {//향상된 for문, 내부적으로 반복자를 생성해서 값을 뽑아낸다.
            System.out.println(integer);
        }

    }
}
