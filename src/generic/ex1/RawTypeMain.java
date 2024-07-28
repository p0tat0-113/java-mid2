package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        //제네릭 인스턴스를 생성할 때 다이아몬드를 빼고 쓸 수도 있음
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>();
        //위 코드와 똑같은 상태. Object 타입을 받고 싶은 것이면 이렇게 쓰는 것을 권장. Object 타입임.

        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();//Object 타입으로 반환하기 때문에 다운캐스팅 해줘야함.
        System.out.println("integer = " + integer);

        /*
        제네릭 타입을 사용할 때 <>를 지정하지 않을 수도 있는데, 이런 것을 Raw Type, 원시타입이라고 한다.
        원시타입을 쓰면 내부의 타입 매개변수가 Object가 된다고 생각하면 됨.
        과거 제네릭이 없던 시절의 코드와의 호환성을 위해서 이렇게 만들었다고 함.
        아무튼 원시타입은 쓰지 않아야 한다고 함.
        Object 타입을 받는게 필요하면 그냥 타입 매개변수를 Object 로 지정해서 사용
         */
    }
}
