package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Integer result = (Integer) GenericMethod.objMethod(i); //Integer로 받으려면 다운 캐스팅 해야함.

        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer generic = GenericMethod.<Integer>geneticMethod(i);//<>를 메서드 앞에 넣어줌.
        System.out.println("generic = " + generic);

        //Number와 그 자식타입들만 타입 인수로 들어갈 수 있음.
        //GenericMethod.<String>numberMethod(i); //컴파일 에러, 타입 제한 걸려있음.
        System.out.println("타입 매개변수 제한");
        Integer integer = GenericMethod.<Integer>numberMethod(i);
        System.out.println("integer2 = " + integer);
        Double doubleVal = GenericMethod.<Double>numberMethod(20.0);
        System.out.println("doubleVal1 = " + doubleVal);

        //제네릭 메서드도 타입 추론이 됨. 메서드에 인자로 들어오는 데이터의 타입을 보고 추론함. 생략했을 뿐, 실제로는 타입 인자가 전달된다는 것을 잊지 말자.
        integer = GenericMethod.numberMethod(i);
        doubleVal = GenericMethod.numberMethod(20.0);
    }
}
