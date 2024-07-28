package collection.re1.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true){
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        }

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }

        System.out.println("입력한 정수의 합계: "+sum);
        System.out.println("입력한 정수의 평균: "+((double) sum / list.size()));
    }
}
