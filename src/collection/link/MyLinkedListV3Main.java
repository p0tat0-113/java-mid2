package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();

        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        //stringList.add(10);//String외의 타입은 못들어감.
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        //integerList.add("d");//당연히 Integer외의 타입은 못 들어옴.
        Integer integer = integerList.get(0);
        System.out.println("integer = " + integer);
    }
}
