package collection.link.re;
/*
- 모든 노드 탐색하기
- 마지막 노드 조회하기
- 특정 index의 노드 조회하기
- 노드에 데이터 추가하기
*/
public class NodeMain1 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        System.out.println(first);

        printAll(first);

        System.out.println("getLast(first) = " + getLast(first));

        System.out.println("getNode(first,2) = " + getNode(first, 1));

        add(first,"D");
        System.out.println(first);
    }

    static void printAll(Node node){
        while (node != null){
            System.out.println(node.item);
            node = node.next;
        }
    }

    static Node getLast(Node node){
        while (node.next != null){
            node = node.next;
        }
        return node;
    }

    static Node getNode(Node node, int index) {
        for (int j = 0; j < index; j++) {
            node = node.next;
        }
        return node;
    }

    static void add(Node first, Object o) {
        Node lastNode = getLast(first);
        lastNode.next = new Node(o);
    }
}
