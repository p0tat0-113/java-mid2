package collection.compare.test2;

public enum Shape {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOVER("♣");

    private String shape;

    Shape(String shape) {//enum의 생성자는 외부에서 호출할 수 없음.
        this.shape = shape;
    }

    @Override
    public String toString() {
        return shape;
    }
}
