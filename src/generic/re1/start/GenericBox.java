package generic.re1.start;

//이렇게 제네릭을 사용한 클래스, 인터페이스를 통틀어서 제네릭 타입이라고 한다.

//메서드가 사용시점에 인수를 받는 것과 마찬가지로,
//제네릭 타입도 인스턴스 생성 시점에 타입 인수를 받는다.
//어떤 타입을 사용할지를 나중으로 미루는 것이다. 덕분에 유연성을 확보하면서, 타입안정성도 챙길 수 있음.

public class GenericBox <T>{//타입 매개변수
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
