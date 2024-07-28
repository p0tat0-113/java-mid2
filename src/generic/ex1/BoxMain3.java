package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        //타입 매개변수를 이용해서 코드 재사용성을 확보함.
        //그리고 인스턴스 생성 후에는 타입이 고정되면서 타입 안정성까지 확보함.

        GenericBox<Integer> integerBox = new GenericBox<Integer>();//T가 어떤 타입이 될지 인스턴스 생성 시점에 결정할 수 있음ㄷㄷ
        integerBox.set(10);//Integer만 허용, 문자열을 넣으려고 하면 컴파일 에러 발생
        Integer integer = integerBox.get();//Integer 타입 반환(캐스팅 필요X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello World");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleVal = doubleBox.get();
        System.out.println("doubleVal = " + doubleVal);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
