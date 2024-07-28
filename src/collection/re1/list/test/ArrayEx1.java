package collection.re1.list.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<>(List.of(90, 80, 70, 60, 50));
        int total = 0;
        for (int i = 0; i < students.size(); i++) {
            total += students.get(i);
        }
        double average = (double) total / students.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
