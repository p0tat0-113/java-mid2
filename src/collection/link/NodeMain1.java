package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기 a->b->c
        Node first = new Node("a");
        first.next = new Node("b");//첫번째 노드에 두번째 노드의 참조값을 넣어줌.
        first.next.next = new Node("c");//두번째 노드에 세번째 노드의 참조값을 넣어줌.

        System.out.println("first.item = " + first.item);
        System.out.println("first.next.item = " + first.next.item);
        System.out.println("first.next.next.item = " + first.next.next.item);

        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while(x != null){//마지막 노드의 next에는 null이 들어있어서 반복문 탈출
            System.out.println(x.item);
            x = x.next;
        }
    }
}
