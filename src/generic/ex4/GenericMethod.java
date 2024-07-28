package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object object){
        System.out.println("Object Print: "+object);
        return object;
    }

    //제네릭 메서드: 얘는 메서드 안으로 한정됨.
    public static <T> T geneticMethod(T object){//<T>로 타입 매개변수를 선언하고 메서드 안에서 잘 쓰면 됨.
        System.out.println("Generic Print: "+object);
        return object;
    }
    //제네릭 메서드의 타입 매개변수도 상한선 제한을 걸 수 있음.
    public static <T extends Number> T numberMethod(T number){
        System.out.println("Number Print: "+number);
        return number;
    }

    //참고: 제네릭 타입의 타입 매개변수는 static메서드에는 사용할 수가 없다.
    //제네릭 타입이라는게 인스턴스 생성시점에 타입을 결정한다는 건데, static메서드는 인스턴스가 아니라 클래스랑 붙어있음. 때문에 사용할 수 없다.
    //static메서드에 제네릭을 사용하려면 제네릭 메서드를 사용해야 한다.
}
