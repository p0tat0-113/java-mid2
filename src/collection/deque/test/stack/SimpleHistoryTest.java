package collection.deque.test.stack;

/*스택에 push() 를 통해서 다음 데이터를 순서대로 입력해라.
"youbute.com"
"google.com"
"facebook.com"
스택에 pop() 을 통해서 데이터를 꺼내고, 꺼낸 순서대로 출력해라.
"facebook.com"
"google.com"
"youtube.com"*/

import java.util.ArrayDeque;

public class SimpleHistoryTest {
    public static void main(String[] args) {

        //스택: 후입선출 - LIFO
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.push("youtube.com");
        deque.push("google.com");
        deque.push("facebook.com");

        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
    }
}
