package collection.set;

import collection.set.member.Member;

public class JavHashCodeMain {

    public static void main(String[] args) {
        //Object의 hashCode()는 객체의 참조값을 기반으로 생성
        //서로 다른 객체는 참조값이 다르다. 그래서 논리적으로 같더라고 해시코드가 달라질 수 밖애 없다.
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        //각 클래스마다 hashCode()를 이미 오버라이딩 해두었다. equals(), toString()을 오버라이딩 해둔 것과 똑같음.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());//이렇게 여러 문자열이 합쳐진 경우에는, 해시 충돌이 최대한 발생하지 않게 하기 위해서 복잡한 연산을 거쳐서 만든다고 함.

        //hashCode는 마이너스 값이 될 수도 있음. 꼭 숫자가 아니여도
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        //둘은 같을까 다를까? 동일하지는 않지만, 동등하다.
        Member member1 = new Member("id1");
        Member member2 = new Member("id1");

        System.out.println("member1 == member2 = " + (member1 == member2));//동일성 비교
        System.out.println("member1.equals(member2) = " + member1.equals(member2));//동등성 비교
        System.out.println("obj1.hashCode() = " + member1.hashCode());
        System.out.println("obj2.hashCode() = " + member2.hashCode());
        //만약 Member의 hashCode()를 오버라이딩 하지 않았다면, Object의 hashCode()가 호출되면서 서로 다른 해시코드가 나왔을 것이다.
    }
}
