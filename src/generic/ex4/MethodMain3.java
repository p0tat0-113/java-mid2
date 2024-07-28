package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", 5);
        Cat cat = new Cat("cat", 3);

        ComplexBox<Dog> dogComplexBox = new ComplexBox<>();

        dogComplexBox.set(dog);

        Cat returnCat = dogComplexBox.<Cat>printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
        //제네릭 메서드의 타입 매개변수가 더 높은 우선순위를 가짐을 확인할 수 있다.
        //프로그래밍에서는 항상 가까운 것이 우선순위가 더 높다. 지역변수가 같은 이름의 멤버변수보다 우선순위가 높은 것과 똑같음.
    }
}
