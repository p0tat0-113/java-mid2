package collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //1,2,5,8,14,99

        //해시인데스로 데이터 저장
        Integer[] inputArray = new Integer[10];
        add(inputArray,1);
        add(inputArray,2);
        add(inputArray,5);
        add(inputArray,8);
        add(inputArray,14);
        add(inputArray,99);
        System.out.println(Arrays.toString(inputArray));

        //해시인덱스로 데이터 검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("hashIndex = " + hashIndex);
        int result = inputArray[hashIndex];
        System.out.println("result = " + result);
    }

    static void add(Integer[] inputArray, int value){
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
        //해시인덱스를 구해서 인덱스로 사용함.
        //해당 인덱스에 데이터를 저장
    }

    //해시인덱스로 변환
    static int hashIndex(int value){
        return value%CAPACITY;
    }
}
