package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);//Object 타입에 Integer 타입을 집어 넣음. 업캐스팅.
        Integer integer = (Integer) integerBox.get();//Integer 타입으로 받으려면 다운캐스팅, get()의 반환타입이 Object 이기 때문
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello world");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        //실수로 잘못된 타입의 인수 전달 시
        integerBox.set("100");//숫자를 넣어야 하는데 실수로 문자열을 넣어버렸음.
        integer = (Integer) integerBox.get();//String을 Integer로 캐스팅 시도, 런타임 예외 발생
        System.out.println("integer = " + integer);

        //Integer만 넣자는 의도로 이름을 integerBox로 지어 놓았는데, 코드가 복잡해지면 어디선가 다른 타입이 들어가버릴 수도 있음.
    }
}
