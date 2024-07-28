package generic.re1.genericMethod;

public class Method1 {
    //인터페이스, 클래스 말고 메서드에도 제네릭을 적용할 수 있다.

    //제네릭 메서드는 이렇게 반환 타입 왼쪽에 <>를 넣어서 선언한다. 이거 외에 쓰는 방법은 제네릭 타입이랑 똑같음.
    //static의 경우 인스턴스가 아닌, 클래스에 붙어있다. 인스턴스가 생성되던 말던 간에 그냥 쓸 수 있음.
    //그래서 static은 제네릭 타입의 타입 매개변수는 쓰지 못한다.
    //static메서드에 제네릭을 쓰고 싶으면, 제네릭 타입과는 별개로 따로 제네릭 메서드로 만들어야 한다.

    public static <T> T genericMethod1(T value){
        System.out.println(value);
        return value;
    }

    //제네릭 메서드도 타입 매개변수 제한을 걸 수 있음.
    //여기에서는 래퍼클래스들의 부모인 Number로 상한을 걸었다.
    public static <T extends Number> T numberMethod1(T value){
        System.out.println(value);
        return value;
    }
}
