package collection.re1.link;

public class Node <T>{
    T item;
    Node next;//다음 노드의 참조값을 보관

    public Node(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node<T> node = this;
        while(node != null){//다음 노드가 null인 노드, 즉 맨 끝 노드가 나올 때까지 순회
            sb.append(node.item);
            node = node.next;
            if (node != null){
                sb.append("->");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}
