package collection.re1.set.start;

import java.util.Arrays;

public class HashIndex {
    public static void main(String[] args) {
        /*Set은 중복을 허용하지 않고, 순서를 보장하지 않는 자료구조이다. 매우 빠른 검색이 특장점이다.
        중복을 허용하지 않으려면, 데이터를 새로 추가할 때마다 모든 데이터들을 검사해서 해당 데이터가 중복되는지 확인해야 한다.
        그런데 순회하면서 검사하기에는 성능이 너무 떨어진다.
        그래서 발상의 전환으로 데어터 자체를 인덱스로 쓰기로 했다.
        데이터로부터 고유한 값이 해시코드를 얻고, 이걸 다시 해시인덱스로 변환해서, 이 인덱스에 데이터를 저장한다.
        이것이 해시 알고리즘이다. 해시 알고리즘을 이용하면 검색 성능을 O(1)로 극적으로 끌어올릴 수 있음.*/

        Integer[] arr = new Integer[10];

        Integer[] values = {1,2,5,8,14,99};
        for (int value : values) {
            arr[hashIndex(value)] = value;
        }
        System.out.println(Arrays.toString(arr));

        //검색 할 때도 데이터로부터 해시인덱스를 구하고, 배열의 해당 인덱스를 꺼내보면 된다.
        System.out.println("arr[hashIndex(99)] = " + arr[hashIndex(99)]);
        System.out.println("arr[hashIndex(3)] = " + arr[hashIndex(3)]);
        //검색을 매우 빠른 속도로 할 수 있음.

        //그런데 여전히 문제가 있음. 이 방식으로는 해시 인덱스가 똑같은, 해시 충돌 문제가 발생한다.
    }

    private static int hashIndex(Integer value){
        return value%10;
    }
}
