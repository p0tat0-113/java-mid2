package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {

        //배열에 0~9사이의 여러 중복되지 않은 값을 입력
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println(Arrays.toString(inputArray));

        //검색
        int searchValue = 8;
        //배열에 특정 값이 있는지 확인하려면 배열 전부를 순회해야 한다. -> O(n)
        for (Integer inputValue : inputArray) {
            if (inputValue == searchValue){
                System.out.println(inputValue);
            }
        }
        //O(n)을 O(1)로 바꿀 수 있는 마법같은 방법이 있다고 함.
    }
}
