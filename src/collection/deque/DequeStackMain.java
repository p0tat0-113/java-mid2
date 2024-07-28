package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {

        //LinkedList를 써도 되긴 하는데, ArrayDeque가 더 빠르다.
        Deque<Integer> deque = new ArrayDeque<>();

        //Stack
        deque.push(1);//앞쪽에서 넣음
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("deque.pop() = " + deque.pop());//후입선출
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
    }
}
