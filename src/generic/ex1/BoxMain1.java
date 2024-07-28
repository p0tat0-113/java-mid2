package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);//오토박싱 Integer.valueOf() 생략
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello world");
        String str = stringBox.getValue();
        System.out.println("str = " + str);

        //간단한 코드이다.
        //그런데 다른 타입들도 담으려면 다 그 타입에 맞는 박스를 만들어야 한다.
        //담는 타입이 수십개라면, 수십개의 XxxBox 를 만들어야 한다.
        //이 문제를 어떻게 해결해야 할까? 일단 모든 객체의 부모인 Object 타입으로 받으면 될 것 같긴 한데...
    }
}
