package collection.list.test.ex1;

/*ArrayEx1 는 배열을 사용한다. 이 코드를 배열 대신에 리스트를 사용하도록 변경하자.
다음 코드와 실행 결과를 참고해서 리스트를 사용하는 ListEx1 클래스를 만들어라*/

import java.util.ArrayList;

public class ListEx1 {
    public static void main(String[] args) {

        ArrayList<Integer> students = new ArrayList<>();
        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        int total = 0;
        for (int i = 0; i < students.size(); i++) {//.length 아님. .size()로 얻어냄.
            total += students.get(i);//[i]로 접근 못함. get(int index)으로 접근
        }
        double average = (double) total / students.size();

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
