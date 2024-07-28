package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {

        //이번에는 숫자의 범위를 0~99까지로 늘린다. 배열의 크기가 그에 맟춰 100으로 늘려야 한다.
        //[null, 1, 2, null, null, 5, null, null, 8, .., 14 ....., 99]
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println(Arrays.toString(inputArray));

        //검색
        //인덱스와 데이터를 맞춘 덕분에 검색성능이 O(1)로 극적으로 향상됨.
        int searchValue = 99;
        Integer result = inputArray[searchValue]; //O(1)
        System.out.println(result);

        //속도가 빠르긴 한데 낭비되는 메모리 공간이 너무 많다.
        //만약 int 숫자의 모든 범위를 커버하려면 42억 사이즈의 배열이 필요하다.
        //데이터의 값을 인덱스로 쓰는 방법은 범위가 좀만 커져도 메모리 낭비가 너무 심하다.
        //이 문제를 또 해결할 수 있는 방법이 있음.
    }
}
