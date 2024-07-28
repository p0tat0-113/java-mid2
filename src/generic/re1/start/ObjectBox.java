package generic.re1.start;

public class ObjectBox {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "value=" + value +
                '}';
    }
}
