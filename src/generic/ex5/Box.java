package generic.ex5;

public class Box<T> {
    //단순한 제네릭 타입
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
