package collection.set.test;

/*문제 설명
두 숫자의 집합이 제공된다.
집합1: 1, 2, 3, 4, 5
집합2: 3, 4, 5, 6, 7
두 집합의 합집합, 교집합, 차집합을 구해라. 출력 순서는 관계없다.
합집합: 두 집합의 합이다. 참고로 중복은 제거한다. [1, 2, 3, 4, 5, 6, 7]
교집합: 두 집합의 공통 값이다. 참고로 중복은 제거한다. [3, 4, 5]
차집합: 집합1에서 집합2와 같은 값을 뺀 나머지 [1, 2]
다음 실행 결과를 참고하자.
Set 인터페이스의 주요 메서드를 참고하자.*/

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        //Set인터페이스가 제공하는 메서드, addAll() retainAll() removeAll()을 써야한다.

        //합집합: 두 집합을 합친다. 중복된 요소는 제거
        Set<Integer> union = new HashSet<>(set1);//생성자 매개변수로 Collection타입도 받음.
        union.addAll(set2);

        //교집합: 공통 값만 남긴다. 중복된 요소는 제거
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        //차집합: 공통되는 값을 제거한다.
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);

    }
}
