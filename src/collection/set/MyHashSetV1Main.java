package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);//capacity를 직접 지정할 수도 있음
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);//해시충돌
        System.out.println(set);

        //검색
        boolean result = set.contains(9);
        System.out.println("contains result = " + result);

        //삭제
        result = set.remove(9);
        System.out.println("remove result = "+result);
        System.out.println(set);
    }
}
