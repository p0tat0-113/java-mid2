package collection.re1.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeMain {
    public static void main(String[] args) {
        /*
        ==스택==
        스택은 후입선출 LIFO 자료구조다.
        ==큐==
        큐는 선입선출 FIFO 자료구조다.

        스택은 별도의 Stack 클래스가 있긴 한데, 성능이 나쁜 레거시임. 그래서 그냥 ArrayDeque를 쓰는 것을 권장한다.
        Collection <- Queue <- Dequq <- ArrayDeque 이런 구조다.
        ArrayDeque는 스택과 큐의 역할을 모두 할 수 있음.
        */

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> queue = new ArrayDeque<>();

        //앞쪽으로 들어가서 앞쪽으로 나옴
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        //뒤쪽으로 들어가서 앞쪽으로 나옴
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

        //그리고 ArrayDeque는 양쪽으로 넣고 뺄 수 있다.
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.offerLast(4);
        System.out.println(deque);

        deque.pollFirst();
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);

        //ArrayDeque인스턴스를 Queue인터페이스에 담으면 좀 더 Queue같이 쓸 수 있음.
        Queue<Integer> realQueue = new ArrayDeque<>();
    }
}
