package collection.re1.array;

import java.util.Arrays;

public class ArrayStart {
    public static void main(String[] args) {
        //배열은 인덱스로 O(1)의 성능으로 요소에 접근할 수 있다. 개씹사기임.
        int[] arr1 = new int[5];

        //인덱스로 데이터 삽입, O(1)
        arr1[0] = 10;
        arr1[1] = 25;
        arr1[2] = 100;
        System.out.println(Arrays.toString(arr1));

        //인덱스로 데이터에 접근, O(1)
        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr1[0] = " + arr1[1]);
        System.out.println("arr1[0] = " + arr1[2]);

        //검색 <- 이새끼가 문제임, O(n) 배열 전체를 순회해야한다.
        int searchValue = 100;
        for (int index = 0; index < arr1.length; index++) {
            if (arr1[index] == searchValue){
                System.out.println(searchValue+" index: "+index);
                break;
            }
        }
    }
}
