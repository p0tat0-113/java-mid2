package collection.re1.link;

import collection.re1.list.MyList;

import java.util.Iterator;

public class MyLinkedList <T> implements MyList<T> {

    private Node<T> first;//첫번째 노드의 참조값을 저장
    private Node<T> last;//마지막 노드의 참조값을 저장
    private int size = 0;//노드의 갯수, 저장된 데이터의 양

    @Override
    public void add(T value) {//마지막 노드를 저장하는 last변수 덕분에 O(1)
        if (size == 0){//처음으로 데이터를 추가하는 경우
            first = new Node<>(value);
            last = first;
        } else {
            last.next = new Node<>(value);//맨 끝 노드 뒤에 붙임.
            last = last.next;//새로 추가된 노드를 last로 지정.
        }
        size++;
    }

    @Override
    public void add(int index, T value) {//인덱스로 접근하는데 O(n), 데이터를 추가하는데 O(1)
        Node<T> newNode = new Node<>(value);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<T> previousNode = getNode(index-1);//getNode() O(n), 마지막 노드를 불러오는 경우 O(1)
            newNode.next = previousNode.next;
            previousNode.next = newNode;
        }
        size++;
    }

    @Override
    public T remove(int index) {//인덱스로 접근하는데 O(n), 데이터를 삭제하는데 O(1)
        Node<T> removedNode = null;
        if (index == 0){
            removedNode = first;
            first = first.next;
        } else{
            Node<T> previousNode = getNode(index-1);//getNode() O(n), 마지막 노드를 불러오는 경우 O(1)
            removedNode = previousNode.next;
            previousNode.next = removedNode.next;
            if (previousNode.next == null){
                last = previousNode;
            }
        }
        size--;
        return removedNode.item;
    }

    @Override
    public T get(int index) {//O(n)
        return getNode(index).item;
    }

    private Node<T> getNode(int index){//해당 인덱스의 노드를 반환하는 private 메서드, O(n)
        if (index == size-1){//맨 끝 인덱스라면 last를 반환. O(1)
            return last;
        }

        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public T set(int index, T value) {//O(n)
        Node<T> node = getNode(index);
        T removedValue = node.item;
        node.item = value;
        return removedValue;
    }

    @Override
    public int indexOf(T value) {//못찾으면 -1 반환, O(n)
        int index = 0;
        Node<T> node = first;
        while(node != null){
            if(node.item.equals(value)){
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node <T> {//Node는 LinkedList안에서만 사용하므로 내부 클래스로 만듦
        T item;
        Node<T> next;

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

    @Override
    public Iterator<T> iterator() {//순회를 위해 Iterable 구현
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<T> {//바깥 클래스의 타입 매개변수 T를 MyLinkedListIterator에서도 그대로 사용
        Node<T> node = first;
        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public T next() {
            T item = node.item;
            node = node.next;
            return item;
        }
    }

    @Override
    public String toString() {
        return first.toString();
    }

    public static void main(String[] args) {
        System.out.println("MyLinkedList 테스트");

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        linkedList.add(1,1000);
        System.out.println(linkedList);
        linkedList.add(3,2000);
        linkedList.add(0,10000);
        System.out.println(linkedList);

        System.out.println("linkedList.get(3) = " + linkedList.get(3));
        System.out.println("linkedList.indexOf(2000) = " + linkedList.indexOf(2000));
        System.out.println("linkedList.size() = " + linkedList.size());

        for (Integer integer : linkedList) {
            System.out.println(integer);
        }

        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.remove(4);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
    }
}
