package generic.ex1;

public class IntegerBox {
    //Integer 타입을 담고 꺼낼 수 있는 간단한 박스, 세터와 게터를 가짐.
    private Integer value;

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
