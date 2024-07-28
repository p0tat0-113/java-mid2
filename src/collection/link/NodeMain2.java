package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기 a->b->c
        Node first = new Node("A");
        first.next = new Node("B");//첫번째 노드에 두번째 노드의 참조값을 넣어줌.
        first.next.next = new Node("C");//두번째 노드에 세번째 노드의 참조값을 넣어줌.

        System.out.println("first.item = " + first);
        System.out.println("first.next = " + first.next);
    }
}
