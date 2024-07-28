package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    //제네릭 타입과 제네릭 메서드의 타입 매개변수 이름이 같으면 어떤 것이 더 우선순위를 가지는지 확인

    private T animal;//여기 있는 T들은 제네릭 타입 소속,

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t){//여기 있는 T들은 제네릭 메서드 소속이다. 참고로 여기있는 T는 상한선이 안걸려있기 때문에 Object로 간주됨.
        System.out.println("animal.className: "+animal.getClass().getName());
        System.out.println("t.className: "+t.getClass().getName());
        return t;
    }
}
