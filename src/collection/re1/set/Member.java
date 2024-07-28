package collection.re1.set;

import java.util.Objects;

public class Member implements Comparable<Member>{

    /*앞에서 숫자로부터 해시인덱스를 구하는 것 까지는 해봤다.
    근데 숫자 말고, 문자나 다른 객체들을 해시 자료구조에 담으려면 어떻게 해야할까?
    앞에서 해시인덱스는 데이터 숫자를 나눈 나머지로 구했다.
    뭔가 숫자가 들어가야만 해시 인덱스를 얻을 수 있다는 것이다.
    이걸 가능하게 하려면 어떤 객체이던지 간에 고유한 숫자를 얻을 수 있어야 한다. 이게 바로 해시코드의 개념이다.

    해시 자료구조는 상당이 유용한 자료구조다. 그래서 어떤 객체이던지 다 여기에 담고 싶음.
    그러려면 어떤 객체이던지 고유한 숫자를 얻을 수 있어야 한다. 모든 객체가 이 공통적인 기능이 필요함. 이것을 역시 Object 클래스가 제공한다.
    그런데 Object가 제공하는 해시함수 hashCode()는 참조값을 기반으로 작동함.
    논리적으로 동등한 객체는 항상 해시코드가 같아야 하는데, 참조값을 기반으로 해시코드를 만들면 해시코드가 매번 달라짐.
    그래서 각 객체에서 hashCode()를 재정의해서 사용해야 한다. equals()를 재정의해서 쓰던 것과 같음.*/

    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Member o) {//내가 직접 만든 객체가 정렬 될 수 있게 하려면 Comparable인터페이스를 구현해야 한다. 혹은 별도의 Comparator를 구현해서 집어넣어줘야 함.
        return id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
