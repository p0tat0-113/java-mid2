package collection.link;

//제네릭 도입, Node를 중첩 클래스로 가져옴.
public class MyLinkedListV3<E> {//제네릭 타입
    private Node<E> first;
    private int size;

    public void add(E e){
        Node<E> newNode = new Node<>(e);//타입 추론
        if (first == null){
            first = newNode;
        } else {
            getLastNode().next = newNode;//마지막 노드의 next필드에 새 노드의 참조값을 넣음.
        }
        size++;
    }

    //추가된 코드
    public void add(int index, E e){//삽입
        Node<E> newNode = new Node<>(e);//타입추론

        if (index == 0){//맨 앞에 추가되는 경우
            newNode.next = first;
            first = newNode;
        } else{
            Node<E> prevNode = getNode(index-1);
            newNode.next = prevNode.next;//맨 뒤에 추가하는 경우 null값이 들어감.
            prevNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode(){//next필드가 null인 노드가 나올 때까지 반복문
        Node<E> node = first;
        while(node.next != null){
            node = node.next;
        }
        return node;
    }

    //추가된 코드
    public E remove(int index){//삭제
        Node<E> deleted = null;
        if(index == 0){
            deleted = first;
            first = first.next;
        } else{
            Node<E> prevNode = getNode(index-1);//삭제하는 노드 직전의 노드
            deleted = prevNode.next;
            prevNode.next = deleted.next;//deleted가 마지막 노드일 경우 null값이 들어감.
        }
        size--;
        return deleted.item;
    }

    public E set(int index, E e){//해당 인데스의 노드를 값을 바꾸고, 기존 값은 반환
        Node<E> node = getNode(index);
        E oldItem = node.item;
        node.item = e;
        return oldItem;
    }

    public E get(int index){//해당 인덱스 노드의 값을 반환
        return getNode(index).item;
    }

    private Node<E> getNode(int index){//해당 인덱스의 노드를 반환
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int indexOf(E e){//같은 값을 가진 노드의 인덱스를 반환, 검색
        //for문을 이렇게도 쓸 수 있음
        //node = node.next를 먼저 한 다음에 node != null검사를 하는 듯
        int index = 0;
        for (Node<E> node = first; node != null; node = node.next){
            if (node.item.equals(e)){
                return index;
            }
            index++;
        }

        return -1; //못찾았으면 -1 반환
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    //Node는 어차피 연결리스트 객체 안에서만 쓰이기 때문에 중첩클래스로 끌고 들어옴.
    private static class Node<E>{//제네릭 타입
        E item;//E 타입 객체만 저장할 수 있다.
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        //toString() 직접 구현, 연결된 노드들을 끝까지 탐색해서 출력
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();//문자열을 계속 더할거라서 가변 사용

            Node<E> x = this;
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
}
