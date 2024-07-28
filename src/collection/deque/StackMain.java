package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {

        //Stack - Last In First Out, 후입선출
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        //다음 꺼낼 요소 확인(실제로 꺼내지는 않음)
        System.out.println("stack.peek() = " + stack.peek());

        //스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());//가장 나중에 넣은 것부터 나옴.
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);

        //Legacy라서 사용하지 않은 것을 권장한다고 한다.
        //대신에 Deque 사용
    }
}
