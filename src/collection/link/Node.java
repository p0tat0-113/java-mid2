package collection.link;

public class Node {
    //노드 클래스를 아주 간단하게 구현함.
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    //IDE가 생성해준 toString()
    /*@Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/

    //toString() 직접 구현, 연결된 노드들을 끝까지 탐색해서 출력
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();//문자열을 계속 더할거라서 가변 사용

        Node x = this;
        sb.append("[");
        while(x != null){
            sb.append(x.item);
            if (x.next != null){
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");

        return sb.toString();
    }
}

