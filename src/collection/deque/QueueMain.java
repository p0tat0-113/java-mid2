package collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        //Queue<Integer> deque = new LinkedList<Integer>();//LinkedList도 Queue의 구현체다.
        Queue<Integer> deque = new ArrayDeque<>();

        //데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        //다음 꺼낼 데이터 확인(실제로 꺼내지 않고 조회만)
        System.out.println("deque.peek() = " + deque.peek());

        //데이터 꺼내기
        System.out.println("deque.poll() = " + deque.poll());//먼저 넣은 것부터 먼저 나옴
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println(deque);
    }
}
