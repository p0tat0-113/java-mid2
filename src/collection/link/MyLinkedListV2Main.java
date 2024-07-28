package collection.link;


public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println("list = " + list);

        //마지막 노드에 추가 O(n)
        System.out.println("==데이터 추가==");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("==첫 번째 항목에 추가==");//O(1)
        list.add(0,"first");
        System.out.println(list);

        System.out.println("==첫 번째 항목 삭제==");//O(1)
        list.remove(0);
        System.out.println(list);

        System.out.println("==중간 항목에 추가==");//O(n), getNode()로 이전 노드를 찾아야 함.
        list.add(2,"middle");
        System.out.println(list);

        System.out.println("==중간 항목 삭제==");//O(n), getNode()로 이전 노드를 찾아야 함.
        list.remove(2);
        System.out.println(list);

    }
}
