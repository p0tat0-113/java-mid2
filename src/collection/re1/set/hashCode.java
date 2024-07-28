package collection.re1.set;

public class hashCode {
    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println("o1.hashCode() = " + o1.hashCode());
        System.out.println("o2.hashCode() = " + o2.hashCode());
        //Object의 hashCode()는 참조값을 기반으로 작동해서 해시코드가 인스턴스마다 다르게 나온다.

        Member member1 = new Member("동우");
        Member member2 = new Member("동우");
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
        //Member는 hashCode()가 이름과 나이를 기반으로 작동하게끔 재정의 해 놓았음. 덕분에 논리적으로 동등한 인스턴스는 같은 해시코드가 나온다.


    }
}
