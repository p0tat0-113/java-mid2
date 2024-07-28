package generic.re1.start;

public class BoxMain1 {
    public static void main(String[] args) {
        /*제네릭을 쓰는 이유.
        제네릭을 쓰는 이유를 한 문장으로 정리하자면
        코드 재사용성과, 타입 안정성을 동시에 확보하기 위함이다.
        클래스 내부에서 사용하는 타입을 클래스를 정의하는 시점이 아니라, 인스턴스 생성 시점에 정할 수 있다는 것*/

        //일단 타입안정성은 확보했지만, 코드 재사용성이 떨어지는 케이스
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);
        //integerBox.setValue("10"); 다른 타입이 들어오면 바로 쳐낸다. 타입안정성이 높음.
        //그러나 다른 타입을 담으려면 코드를 새로 짜야한다. 유연성이 떨어짐.


        //코드 재사용성은 확보했지만, 타입 안정성이 떨어지는 경우
        ObjectBox objectBox = new ObjectBox();
        objectBox.setValue(10);
        objectBox.setValue("10");//아무 타입이나 다 들어감.
        //내부적으로 모든 타입의 부모인 Object타입을 사용해서, 모든 타입을 이 ObjectBox에 담을 수 있다.
        //코드 재사용성을 확보함. 그런데, 모든 타입을 다 담을 수 있다는게 문제다. 값을 꺼낼 때 이게 실제로 어떤 타입의 인스턴스인지 알 수가 없음.
        String string = (String)objectBox.getValue();//이렇게 알맞게 다운캐스팅을 하는 경우에는 괜찮음.
        //Integer integer = (Integer)objectBox.getValue();//이렇게 인스턴스의 타입과 다르게 다운캐스팅 하는 경우 런타임 예외가 발생한다.
        //타입 안전성이 떨어지는 것.


        //코드 재사용성과, 타입 안정성 두마리 토끼를 동시에 잡을 수 있는 것이 바로 제네릭이다.
        GenericBox<Integer> genericIntegerBox = new GenericBox<>();//타입 인수로 Integer를 넣었다. GenericBox내부의 타입 매개변수가 Integer로 바뀜
        genericIntegerBox.setValue(10);
        //genericIntegerBox.setValue("10"); //다른 타입을 넣으면 바로 컴파일 에러 발생
        System.out.println("genericIntegerBox.getValue() = " + genericIntegerBox.getValue());//값을 꺼낼 때도 다운캐스팅 할 필요가 없음.

        GenericBox<String> genericStringBox = new GenericBox<>();
        //genericStringBox.setValue(10); //다른 타입을 넣으면 바로 컴파일 에러 발생
        genericStringBox.setValue("10");
        System.out.println("genericStringBox.getValue() = " + genericStringBox.getValue());

    }
}
