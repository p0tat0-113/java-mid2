package generic.re1.start;

public class IntegerBox {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IntegerBox{" +
                "value=" + value +
                '}';
    }
}
