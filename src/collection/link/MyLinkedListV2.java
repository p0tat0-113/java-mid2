package collection.link;

import java.util.ArrayList;

public class MyLinkedListV2 {
    private Node first;
    private int size;

    public void add(Object o){
        if (first == null){
            first = new Node(o);
        } else {
            getLastNode().next = new Node(o);//마지막 노드의 next필드에 새 노드의 참조값을 넣음.
        }
        size++;
    }

    //추가된 코드
    public void add(int index, Object o){//삽입
        Node newNode = new Node(o);

        if (index == 0){//맨 앞에 추가되는 경우
            newNode.next = first;
            first = newNode;
        } else{
            Node prevNode = getNode(index-1);
            newNode.next = prevNode.next;//맨 뒤에 추가하는 경우 null값이 들어감.
            prevNode.next = newNode;
        }
        size++;
    }


    private Node getLastNode(){//next필드가 null인 노드가 나올 때까지 반복문
        Node node = first;
        while(node.next != null){
            node = node.next;
        }
        return node;
    }

    //추가된 코드
    public Object remove(int index){//삭제
        Node deleted = null;
        if(index == 0){
            deleted = first;
            first = first.next;
        } else{
            Node prevNode = getNode(index-1);//삭제하는 노드 직전의 노드
            deleted = prevNode.next;
            prevNode.next = deleted.next;//deleted가 마지막 노드일 경우 null값이 들어감.
        }
        size--;
        return deleted.item;
    }

    public Object set(int index, Object o){//해당 인데스의 노드를 값을 바꾸고, 기존 값은 반환
        Node node = getNode(index);
        Object oldItem = node.item;//해당 노드의 기존 값을 빼서 저장
        node.item = o;//기존 값을 새로운 값으로 바꿈
        return oldItem;//기존 값 반환
    }

    public Object get(int index){//해당 인덱스 노드의 값을 반환
        return getNode(index).item;
    }

    private Node getNode(int index){//해당 인덱스의 노드를 반환
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int indexOf(Object o){//같은 값을 가진 노드의 인덱스를 반환, 검색
        /*Node node = first;
        for (int i = 0; i < size; i++) {
            if (node.item.equals(o)){//값이 같은 노드를 찾으면
                return i;//해당 인덱스를 반환
            }
            node = node.next;
        }*/

        //for문을 이렇게도 쓸 수 있음
        //node = node.next를 먼저 한 다음에 node != null검사를 하는 듯
        int index = 0;
        for (Node node = first; node != null; node = node.next){
            if (node.item.equals(o)){
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

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        Object oldItem = list.set(1,"X");
        System.out.println("oldItem = " + oldItem);
        System.out.println(list);

        Object item = list.get(1);
        System.out.println("item = " + item);

        int index = list.indexOf("C");
        System.out.println("index = " + index);
    }
}
