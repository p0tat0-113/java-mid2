package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기 a->b->c
        Node first = new Node("A");
        first.next = new Node("B");//첫번째 노드에 두번째 노드의 참조값을 넣어줌.
        first.next.next = new Node("C");//두번째 노드에 세번째 노드의 참조값을 넣어줌.

        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        System.out.println("마지막 노드 조회하기");
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 index의 노드의 값 조회하기
        System.out.println("특정 index의 노드 조회하기");
        Node index2Node = getNode(first,2);
        System.out.println("index2Node = " + index2Node.item);

        //데이터 추가하기(맨 뒤에)
        System.out.println("데이터 추가하기(맨 뒤에)");
        add(first, "D");
        System.out.println(first);
    }


    private static void printAll(Node node){
        while(node != null){
            System.out.println(node.item);
            node = node.next;
        }
    }

    private static Node getLastNode(Node node) {
        while(node.next != null){//지금 노드의 다음이 null이면, 지금 노드가 마지막 노드
            node = node.next;
        }
        return node;
    }

    //특정 index의 노드의 값 조회하기
    private static Node getNode(Node node, int index) {
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //맨 뒤에 노드를 추가
    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);//맨 뒤에 있는 노드를 찾아서 새로운 노드를 연결
    }
}
