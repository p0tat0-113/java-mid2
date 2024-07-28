package collection.set;

//해시 충돌 구현, 해시 충돌 상황을 만들어보고 대응 방법까지

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //1,2,5,8,9,14,99

        /*버킷의 각 요소에 해시충돌이 발생한 데이터들을 담기 위한 LinkedList를 넣을 것이다.
        2차원 배열 이라고 보면 됨. 꼭 LinkedList를 쓰지는 않아도 된다고 함.
        해시충돌이 발생한 가능성은 작기 때문에, 필요한 만큼만 메모리를 차지하는 LikedList를 쓴 것이라고 함.*/
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<Integer>();//배열의 각 요소에 LinkedList를 넣어줌.
        }
        System.out.println("buckets = "+Arrays.toString(buckets));

        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9);//해시 충돌
        System.out.println("buckets = "+Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        System.out.println("buckets.contains("+searchValue+") = " + contains(buckets, searchValue));
    }

    private static void add(LinkedList<Integer>[] buckets, int value){
        int hashIndex = hashIndex(value);

        LinkedList<Integer> bucket = buckets[hashIndex];//배열에 해시인덱스로 접근해서 LinkedList를 꺼내옴 O(1)
        if (!bucket.contains(value)){//버킷 중복 검사후 중복되는 값이 없는 경우에만 추가함. O(n)
            bucket.add(value);
        }
        //중복 검사를 하는 이유는 이것이 set이니까
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue){
        int hashIndex = hashIndex(searchValue);

        LinkedList<Integer> bucket = buckets[hashIndex];//배열에 해시인덱스로 접근해서 LinkedList를 꺼내옴 O(1)
        return bucket.contains(searchValue);//버킷 중복 검사 O(n)
        //LinkeList가 제공하는 contains()메서드를 사용했다.
    }

    private static int hashIndex(int value){
        return value%CAPACITY;
    }
}
