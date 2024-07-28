package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3(2);

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        System.out.println("마지막에 추가 O(1)");
        list.add(4,"e");
        System.out.println(list);

        System.out.println("맨 앞에 추가 O(n)");
        list.add(0,"x");
        System.out.println(list);

        System.out.println("맨 뒤에 꺼 삭제 O(1)");
        list.remove(5);
        System.out.println(list);

        System.out.println("맨 앞에 꺼 삭제 O(n)");
        list.remove(0);
        System.out.println(list);
    }
}
