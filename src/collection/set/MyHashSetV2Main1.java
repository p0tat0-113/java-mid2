package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);

        //해시코드 출력
        System.out.println("\"A\".hashCode() = " + "A".hashCode()); // -> 5 해시인덱스 변환
        System.out.println("\"B\".hashCode() = " + "B".hashCode()); // -> 6 해시충돌
        System.out.println("\"AB\".hashCode() = " + "AB".hashCode()); // -> 1
        System.out.println("\"SET\".hashCode() = " + "SET".hashCode()); // -> 6 해시충돌

        //검색
        boolean result = set.contains("SET");
        System.out.println("result = " + result);
    }
}
