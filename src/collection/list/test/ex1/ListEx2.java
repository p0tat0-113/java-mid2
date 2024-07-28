package collection.list.test.ex1;

/*사용자에게 n 개의 정수를 입력받아서 List 에 저장하고, 입력 순서대로 출력하자.
0 을 입력하면 입력을 종료하고 결과를 출력한다.
출력시 출력 포멧은 1, 2, 3, 4, 5와 같이 , 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
실행 결과 예시를 참고하자.*/

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true){
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
            nums.add(String.valueOf(num));
        }

        System.out.println("출력");
        System.out.println(String.join(", ", nums));
        //String.join()에 들어가려면 타입 매개변수를 CharSequence의 자식이어야 해서 ArrayList<String> 이렇게 함.
    }
}
