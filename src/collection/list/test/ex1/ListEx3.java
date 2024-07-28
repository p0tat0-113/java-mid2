package collection.list.test.ex1;

/*사용자에게 n 개의 정수를 입력받아서 List 에 보관하고,
보관한 정수의 합계와 평균을 계산하는 프로그램을 작성하자.*/

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true){
            int num = scanner.nextInt();
            sum += num;
            if (num == 0){
                break;
            }
            nums.add(num);
        }
        double average = (double) sum / nums.size();

        System.out.println("입력한 정수의 합계: "+sum);
        System.out.println("입력한 정수의 평균: "+average);
    }
}
