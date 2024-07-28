package generic.ex1;

public class ObjectBox {
    //Object 는 모든 객체의 부모이다.
    //부모 타입은 자식 타입을 받을 수 있다.
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}
