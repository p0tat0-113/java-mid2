package generic.ex1;

public class GenericBox<T> {

    private T value;//T말고 다른거 써도 됨.

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    /*
    - <>를 사용한 클래스를 제네릭 클래스라고 한다. <>를 보통 다이아몬드라고 함.
    - 제네릭 클래스를 사용할 때는 타입을 미리 정하지 않는다.
    - 대신에 클래스명 오른쪽에 <T>같이 선언하면 제네릭 클래스가 됨. T는 타입 매개변수이다.
    이후에 타입 매개변수가 여러 타입들로 변할 수 있다.
    - 클래스내부에서 T 타입이 필요한 곳에 T를 적으면 된다.
     */
}
