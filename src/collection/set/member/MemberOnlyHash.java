package collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {

    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //equals()를 오버라이딩 하지 않음. 참조값만 가지고 비교하는 Object의 equals()가 호출된다.

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
