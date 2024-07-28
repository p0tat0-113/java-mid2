package collection.link;


public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("list = " + list);

        System.out.println("==데이터 추가==");
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.indexof('c') = " + list.indexOf("c"));
        System.out.println("list.set(2,'x') = " + list.set(2, "x"));//기존값이 반환됨
        System.out.println(list);

        System.out.println("==길이가 유동적으로 늘어남. capacity 초과 문제X==");
        list.add("x");
        System.out.println(list);
        list.add("x");
        System.out.println(list);
        list.add("x");
        System.out.println(list);

    }
}
