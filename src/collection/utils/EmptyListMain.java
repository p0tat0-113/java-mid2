package collection.utils;

import java.util.*;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        ArrayList<Object> list1 = new ArrayList<>();
        LinkedList<Object> list2 = new LinkedList<>();

        //빈 불변 리스트 생성, 불변이라 값을 못 넣음
        List<Object> list3 = Collections.emptyList();//자바5
        List<Object> list4 = List.of();//자바9

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        Integer[] arr = {1, 2, 3};
        List<Integer> arrList = Arrays.asList(arr);//배열의 참조값을 그대로 가져다가 리스트를 생성함. 길이는 바꿀 수 없지만 기존 요소를 바꿀 수는 있음.
        arrList.set(0,100);
        System.out.println("arr = " + Arrays.toString(arr));//참조값을 그대로 쓰기 때문에 기존 배열의 요소도 바뀜.
        System.out.println("arrList = " + arrList);
        //거의 대부분의 경우에는 그냥 List.of()사용을 권장한다.

    }
}
