package collection.array.arrayFeature;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        //인덱스 입력: O(1) - Bog-O 표기법 시간복잡도
        System.out.println("==인덱스 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //index 변경: O(1)
        System.out.println("==index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        //index 조회: O(1)
        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);
        //인덱스를 사용하면 한 번의 계산으로 자료의 위치를 빠르게 찾을 수 있다.
        
        //배열 검색(특정 값의 위치를 찾음): O(n) <- 최악의 경우 배열의 길이만큼 돌아야 함.
        System.out.println("배열 검색(특정 값의 위치를 찾음): O(n)");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr ["+i+"]: "+arr[i]);
            if (arr[i] == value){
                System.out.println("찾음");
                return;
            }
        }
    }
}
