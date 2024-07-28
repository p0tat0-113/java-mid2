package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {

        //이런 리스트는 멀티 쓰레드 상황에서 동기화 문제가 발생한다. 파이썬 때 배운 임계영역 끼어들기 문제
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        System.out.println("list.getClass() = " + list.getClass());

        //일반 리스트를 멀티쓰레드 상황에서도 안전한 리스트로 만들 수 있다.
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList.getClass() = " + synchronizedList.getClass());
    }
}
