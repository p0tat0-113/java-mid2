package collection.re1.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListEx2 {
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

        System.out.println("출력");
        Iterator<Integer> iterator = list.iterator();
        StringBuilder sb = new StringBuilder();
        while(true){
            sb.append(iterator.next());
            if (!iterator.hasNext()){
                break;
            }
            sb.append(", ");
        }
        System.out.println(sb);
    }
}
