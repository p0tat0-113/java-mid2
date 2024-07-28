package collection.re1.set.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HashCollision {

    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        //해시 충돌 상황을 재현해보고, 이걸 어떻게 해결하는지도 직접 만들어본다.

        /*해시 충돌이 일어나면, 해당 인덱스의 bucket을 꺼낸 다음에 bucket전체를 순회하면서
        중복을 검사해야한다. O(n)
        해시충돌이 발생하면 검색성능이 떨어짐. 그래서 해시충돌이 최대한 발생하지 않도록 하는 것이 좋다.
        해시 충돌 확률은 입력받는 데이터의 수와 배열의 크기에 관계가 있다.
        데이터의 수가 배열 크기의 75%를 넘어가기 시작하면 해시충돌이 잦아진다.
        메모리를 너무 낭비하지 않으면서도, 해시충돌이 최대한 일어나지 않게 배열의 크기를 알잘딱 유지하는 것이 관건이다.*/

        List<Integer>[] buckets = new List[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        System.out.println(Arrays.toString(buckets));

        add(1,buckets);
        add(2,buckets);
        add(5,buckets);
        add(8,buckets);
        add(14,buckets);
        add(99,buckets);
        System.out.println(Arrays.toString(buckets));

        //중복 되는 값 투입
        add(14,buckets);
        add(99,buckets);
        System.out.println(Arrays.toString(buckets));

        //해시 충돌 발생
        add(4,buckets);
        add(9,buckets);
        System.out.println(Arrays.toString(buckets));

        //contains()
        System.out.println("contains(4,buckets) = " + contains(4, buckets));
        System.out.println("contains(9,buckets) = " + contains(9, buckets));
    }

    private static boolean add(Integer value, List<Integer>[] buckets){
        //먼저 값으로부터 해시 인덱스를 구해야함.
        int index = hashIndex(value);

        //얻어낸 인덱스로 배열에 접근해서 버킷을 꺼내옴.
        List<Integer> bucket = buckets[index];

        //버킷 전체를 순회하며, 중복 되는 값이 있는지 검사
        if (!bucket.contains(value)){
            bucket.add(value);
            return true;
        }
        return false;
    }

    private static boolean contains(Integer value, List<Integer>[] buckets){
        //먼저 값으로부터 해시 인덱스를 구해야함.
        int index = hashIndex(value);

        //얻어낸 인덱스로 배열에 접근해서 버킷을 꺼내옴.
        List<Integer> bucket = buckets[index];

        //버킷 전체를 순회하며, 중복 되는 값이 있는지 검사
        return (bucket.contains(value));
    }

    private static int hashIndex(Integer value){
        return value%CAPACITY;
    }
}
