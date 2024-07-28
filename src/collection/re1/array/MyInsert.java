package collection.re1.array;

import java.util.Arrays;

public class MyInsert {
    public static void main(String[] args) {

        //배열은 데이터를 중간에서 삽입할 때, 데이터를 옆으로 밀어서 빈 공간을 확보해야 하기 때문에 성능이 나쁘다. O(n)
        //맨 앞에 삽입하면 모든 데이터를 밀어야 하기 때문에 성능이 가장 나쁨 O(n)
        //중간에 삽입하면 절반의 데이터를 밀어야 함 O(n/2)
        //맨 뒤에 삽입하면 데이터를 밀지 않아도 됨 O(1)
        //포인트는 배열의 경우 어디에 삽입하는 냐에 따라 성능이 다르다는 것이다.

        add(1,100);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] arr = {1,2,3,0,0,0,0,0};

    private static void add(int index, int value){
        shiftRight(index);//데이터를 미는 과정 <= O(n)
        arr[index] = value;//해당 인덱스에 데이터 삽입 <= O(1)
    }

    private static void shiftRight(int index){//데이터를 오른쪽으로 한 칸 씩 밀어주는 메서드, O(n)
        for (int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i-1];
        }
    }
}
