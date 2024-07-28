package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        MemberOnlyHash member1 = new MemberOnlyHash("A");
        MemberOnlyHash member2 = new MemberOnlyHash("A");
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
        System.out.println("member1.equals(member2) = " + member1.equals(member2));

        System.out.println("System.identityHashCode(member1) = " + System.identityHashCode(member1));//참조값 출력
        System.out.println("System.identityHashCode(member2) = " + System.identityHashCode(member2));

        //중복 등록
        //해시코드, 해시인덱스까지는 똑같이 나오는데, equals()가 참조값만 가지고 비교하기 때문에 중복 검사가 제대로 안됨.
        set.add(member1);
        set.add(member2);
        System.out.println(set);//같은 데이터가 중복으로 들어갔음을 확인할 수 있다. set이 set이 아니게 됨

        //검색 실패
        //해시인덱스까지는 제대로 찾아감. 근데 equals()가 참조값만 가지고 비교를 해서 중복검사가 제대로 안됨.
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());

        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);

        //중복으로 등록되고, 검색도 안되고 난리가 남.

    }
}
