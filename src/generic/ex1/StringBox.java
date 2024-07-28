package generic.ex1;

public class StringBox {
    //String 타입을 담고 꺼낼 수 있는 간단한 박스, 세터와 게터를 가짐.
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
