package collection.array.arrayFeature;

import java.util.Arrays;
import java.util.Scanner;

public class myInsert {
    public static void main(String[] args) {
        Arr arr = new Arr();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("삽입할 숫자: ");
            int num = scanner.nextInt();
            System.out.print("인덱스: ");
            int index = scanner.nextInt();

            arr.insert(num,index);
        }
    }

    static class Arr{
        private int[] arr = {1,2,3,4,5};

        public Arr insert(int value, int index){
            if (index >= arr.length){
                throw new RuntimeException("잘못된 인덱스");
            }

            for (int i = arr.length-1; i > index; i--) {//맨 끝 인덱스가 들어오면 반복문이 실행되지 않음.
                arr[i] = arr[i-1];
            }
            arr[index] = value;//뒤로 한칸씩 미는 과정이 모두 끝났으므로 삽입
            System.out.println(Arrays.toString(arr));

            return this;
        }
    }
}
