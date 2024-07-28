package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        //둘은 논리적으로 동등한 객체. 근데 equals(),hashCode()를 오버라이딩 하지 않음.
        //따라서 Object의 equals(),hashCode()가 호출된다.
        MemberNoHashNoEq member1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq member2 = new MemberNoHashNoEq("A");
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
        System.out.println("member1.equals(member2) = " + member1.equals(member2));

        //중복 등록
        set.add(member1);
        set.add(member2);
        System.out.println(set);//같은 데이터가 중복으로 들어갔음을 확인할 수 있다. set이 set이 아니게 됨

        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);

        //중복으로 등록되고, 검색도 안되고 난리가 남.
        //논리적으로 동등한 새 객체의 해시코드가 다 다르다. Objcet의 hashCode()는 참조값을 기반으로 해시코드를 생성하기 때문
    }
}
