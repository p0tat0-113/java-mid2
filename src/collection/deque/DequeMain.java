package collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {

        //Dequq의 대표적인 구현체로는 ArrayDequq와 LinkedList가 있다.
        //Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        //데이터 추가
        deque.offerFirst(1);//앞에서부터 넣음.
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);

        deque.offerLast(3);//뒤에서부터 넣음
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        //다음 꺼낼 데이터 확인(실제로 꺼내지 않고 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        //데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());//앞에서부터 꺼냄.
        System.out.println("deque.pollFirst() = " + deque.pollFirst());

        System.out.println("deque.pollLast() = " + deque.pollLast());//뒤에서부터 꺼냄.
        System.out.println("deque.pollLast() = " + deque.pollLast());

        System.out.println(deque);
    }
}
