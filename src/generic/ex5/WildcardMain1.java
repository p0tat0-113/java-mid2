package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("dog",10));

        WildcardEx.printGenericV1(dogBox);//Box<Dog> dogBox를 전달, 타입 추론에 의해서 타입 T가 Dog이 된다!
        //WildcardEx.<Dog>printGenericV1(dogBox); 실제로는 이런 상태라는 것.
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
        //dogBox로 집어넣으면 Dog타입으로, catBox로 집어넣으면 Cat타입으로 반환하게 하고 싶지만 와일드 카드로는 안됨.
    }
}
