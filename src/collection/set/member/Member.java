package collection.set.member;

import java.util.Objects;

public class Member {

    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //id가 같은 member객체는 서로 같은 객체라고 판단할거임.

    //동등성, id가 같으면 논리적으로 같은 객체로 판단
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    //id가 같은 member객체, 즉 논리적으로 같은 객체는 해시코드도 같아야 한다.
    //만약 이렇게 오버라이딩 하지 않으면 Object의 hashCode()가 호출된다. 걔는 객체의 참조값을 가지고 만들어버림.
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
