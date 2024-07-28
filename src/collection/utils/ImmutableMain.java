package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        //불변을 가변 리스트로 전환, 불변 리스트를 생성자 인수로 넣어버림
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(6);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        //가변을 불변리스트로 전환
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        //unmodifiableList.add(7);변경 시도시 예외 발생
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());
    }
}
