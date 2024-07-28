package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {

        //정말 Queue의 기능만 쓰고 싶으면 Queue인터페이스를 사용하자.
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);//뒤쪽에서 넣음.
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("deque.poll() = " + deque.poll());//선입선출
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println(deque);
    }
}
