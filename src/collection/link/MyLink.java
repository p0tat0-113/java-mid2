package collection.link;

import java.util.Arrays;
import java.util.LinkedList;

public class MyLink<T> {

    private Node firstNode;
    private Node lastNode;
    private int length;

    public void add(T item){
        Node newNode = new Node(item);
        length++;
        if(firstNode == null && lastNode == null){
            firstNode = newNode;
            lastNode = newNode;
            return;
        }
        lastNode.next = newNode;//맨 뒤에 있는 노드에 새로운 노드의 참조값을 넣어서 연결해줌.
        lastNode = newNode;//이제 새로운 노드가 마지막 노드가 된다.
        //마지막 노드의 참조값을 저장하는 lastNode변수 덕분에 add()메서드가 O(1)의 성능을 제공함.
        //MyLinkedListV1은 매번 getLastNode()를 돌리기 때문에 O(n)이다.
    }

    public String toString(){
        Object[] arr = new Object[length];

        Node node = firstNode;
        for (int i = 0; i < length; i++) {
            arr[i] = node.item;
            node = node.next;
        }
        return Arrays.toString(arr) + length;
    }

    public T get(int index){
        if (index < 0 && index >= length){
            throw new RuntimeException("wrong index");
        }

        return getNode(index).item;
    }

    private Node getNode(int index){//해당 인덱스의 노드를 반환
        Node node = firstNode;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insert(int index, T item){
        if (index < 0 && index >= length){
            throw new RuntimeException("wrong index");
        }

        Node newNode = new Node(item);

        if (index != (length-1)){//맨 뒤에 추가하는게 아니라면
            Node backNode = getNode(index);//인덱스 위치에 있던 원래 노드
            newNode.next = backNode;//새 노드와 그 뒤에 오는 노드를 연결
        } else{
            lastNode.next = newNode;//맨 뒤에 추가하는 경우 lastNode 변수 덕분에 O(1)의 성능을 제공할 수 있다.
            return;
        }

        if (index == 0){//맨 앞에 추가하는 거라면
            firstNode = newNode;
        } else{
            Node frontNode = getNode(index-1);//인덱스 위치 보다 한 칸 왼쪽의 노드
            frontNode.next = newNode;//한 칸 왼쪽의 노드와 새 노드를 연결
        }
        length++;
    }

    /*public void insert(int index, T item) {
        if (index < 0 && index >= length) {
            throw new RuntimeException("wrong index");
        }

        Node newNode = new Node(item);

        if(index == 0){
            newNode.next = firstNode;
            firstNode = newNode;
        } else{
            Node prevNode = getNode(index-1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        length++;
    }*/


    //Node 내부 클래스
    private class Node{
        T item;
        Node next;

        public Node(T item) {
            this.item = item;
        }
    }

    public static void main(String[] args) {
        MyLink<String> link = new MyLink<>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println("link = " + link);

        System.out.println("link.get(0) = " + link.get(0));
        System.out.println("link.get(1) = " + link.get(1));
        System.out.println("link.get(2) = " + link.get(2));

        link.insert(1,"x");
        System.out.println("link = " + link);

        link.insert(0,"A");
        System.out.println("link = " + link);

        link.insert(5,"Z");
        System.out.println("link = " + link);
    }
}
