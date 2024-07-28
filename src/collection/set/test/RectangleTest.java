package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class RectangleTest {
    public static void main(String[] args) {
        Set<Rectangle> rectangleSet = new HashSet<>();//해시 자료구조에 담으려면, equals() hashCode()를 반드시 재정의 해야함.
        //재정의 하지 않으면, 데이터가 중복으로 등록되고, 검색도 제대로 안되는 대참사가 벌어진다.

        rectangleSet.add(new Rectangle(10, 10));
        rectangleSet.add(new Rectangle(20, 20));
        rectangleSet.add(new Rectangle(20, 20)); //중복

        for (Rectangle rectangle : rectangleSet) {
            System.out.println("rectangle = " + rectangle);
        }
    }
}
