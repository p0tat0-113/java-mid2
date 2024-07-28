package collection.set;

import java.util.Arrays;
import java.util.Objects;

public class HashStart2 {
    public static void main(String[] args) {

        //이번에는 데이터와 인덱스를 맞춤. 저장할 때와 조회할 때 데이터의 값을 인덱스로 사용.
        //[null, 1, 2, null, null, 5, null, null, 8, null
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println(Arrays.toString(inputArray));

        //검색
        //인덱스와 데이터를 맞춘 덕분에 검색성능이 O(1)로 극적으로 향상됨.
        int searchValue = 8;
        Integer result = inputArray[searchValue]; //O(1)
        System.out.println(result);

        //그런데 여전히 입력값의 범위만큼 큰 배열을 사용해야 하기 때문에 공간이 낭비되는 문제가 있음.
        //그리고 숫자말고 다른 객체들은 어떻게 하려는 건지도 궁금하네
    }
}
