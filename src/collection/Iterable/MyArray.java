package collection.Iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer>{
    //Iterable을 구현하는 것으로 이 자료구조는 순회 가능하다는 것을 알 수 있음.

    //반복자 MyArrayIterator를 반환하는 아주 간단한 반복가능 자료구조 구현

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public MyArrayIterator iterator() {
        return new MyArrayIterator(numbers);
        //생성자 인수로 타켓 배열을 넣어서 MyArrayIterator 반복자 객체를 생성 후 반환
    }
}
