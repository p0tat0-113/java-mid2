package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        Member hi = new Member("hi");//해시충돌
        Member jpa = new Member("JPA");//해시충돌
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println("set = " + set);

        //검색
        Member searchMember = new Member("JPA");
        boolean result = set.contains(searchMember);
        System.out.println("set.contains(Member{id='JPA'}) = " + result);

        //삭제
        set.remove(searchMember);
        System.out.println("set = " + set);
    }
}
