package generic.re1.genericMethod;

public class Method1Main {
    public static void main(String[] args) {

        Method1.<String>genericMethod1("Hello");//타입 인자를 전달함.

        Method1.<Integer>genericMethod1(10);
        //Method1.<String>numberMethod1("10"); //타입 매개변수 상한을 Number로 걸었기 때문에 String은 들어가지 못함.

        //제네릭 메서드도 타입 추론이 된다.
        Method1.genericMethod1("Hello");
        Method1.genericMethod1(10);
        //입력 받은 인자에 맞춰서 자동으로 타입인자를 전달함.
    }
}
