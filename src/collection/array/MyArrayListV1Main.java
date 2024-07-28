package collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("list = " + list);

        System.out.println("==데이터 추가==");
        list.add("a");
        System.out.println("list = " + list);
        list.add("b");
        System.out.println("list = " + list);
        list.add("c");
        System.out.println("list = " + list);


        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.indexof('c') = " + list.indexof("c"));
        System.out.println("list.set(2,'x') = " + list.set(2, "x"));//기존값이 반환됨
        System.out.println(list);

        System.out.println("==범위 초과==");
        list.add("x");
        System.out.println(list);
        list.add("x");
        System.out.println(list);
        //예외 발생
        list.add("x");
        System.out.println(list);
        //Capacity가 늘어나지 않으면 예외가 발생함.
        //그럼 이제 배열의 크기가 동적으로 늘어나게끔 리팩토링 해봐야갰지?
    }
}
