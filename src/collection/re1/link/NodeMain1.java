package collection.re1.link;

public class NodeMain1 {
    public static void main(String[] args) {
        /*배열 리스트의 장점과 단점
        배열리스트는 내부적으로 배열을 사용하기 때문에 배열의 특성을 고스란히 가져간다.
        장점:
        인덱스를 통해 접근할 때 O(1)로 매우 빠름
        단점:
        배열의 크기와, 실제 데이터 저장량의 차이로 메모리가 낭비되는 측면이 있음.
        중간에 데이터를 삽입, 삭제할 경우 데이터를 밀고 땡겨야 하기 때문에 성능이 O(n)으로 나쁘다.

        이런 단점을 해결한 자료구조가 있음. 바로 LinkedList
        노드간의 연결구조를 사용한 자료구조이다.
        필요할 때 노드를 생성해서 연결시키기 때문에 메모리 낭비가 없음.
        그리고 중간에 데이터를 삽입, 삭제할 때도 데이터를 밀고 땡길 필요 없이 노드 연결만 손 보면 됨.
        근데 인덱스를 통한 접근이 O(n)으로 느리다는 단점이 있다.*/

        //각 노드의 Node next 필드에 다음 노드의 참조값을 담는다. 이렇게 노드들이 참조값을 통해 서로 연결됨.
        Node<String> first = new Node<>("A");
        first.next = new Node("B");//노드 연결
        first.next.next = new Node("C");//B노드에 연결

        System.out.println("first = " + first);
        System.out.println("first.next = " + first.next);
        System.out.println("first.next.next = " + first.next.next);

        System.out.println("==printAll()==");
        printAll(first);

        System.out.println("==printLast()==");
        printLast(first);

        System.out.println("==get(1)==");
        get(1,first);

        System.out.println("==add()==");
        add("D",first);
        System.out.println(first);

        /*이렇게 각각의 노드를 연결하여서 리스트 자료구조를 구현할 수 있다.
        리스트란 중복을 허용하고, 순서를 보장하는 자료구조를 의미한다.
        리스트를 구현하는데, ArratList, LinkedList등의 다양한 구현체들이 있는 것이다.*/
    }

    //모든 노드를 탐색
    //모든 노드를 탐색하는 방법: 노드의 next에 다른 노드의 참조값이 아닌, null값이 들어있다면 연결의 맨 끝
    private static void printAll(Node<?> node){//와일드 카드 사용
        while(node != null){
            System.out.println(node.item);
            node = node.next;
        }
    }

    //마지막 노드 겟또
    private static Node<?> printLast(Node<?> node){
        while (node.next != null){
            node = node.next;
        }
        System.out.println(node.item);
        return node;
    }

    //특정 인덱스의 노드 조회하기
    private static void get(int index, Node<?> node){
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        System.out.println(node.item);
    }

    //맨 뒤에 새로운 노드 추가
    private static void add(String item,Node<?> node){
        Node<?> last = printLast(node);
        last.next = new Node<String>(item);
    }
}
