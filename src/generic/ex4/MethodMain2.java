package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("dog1", 10);
        Dog dog2 = new Dog("dog2", 15);
        Cat cat1 = new Cat("cat1", 3);

        AnimalMethod.checkUp(dog1);//타입 추론
        AnimalMethod.checkUp(dog2);//인수로는 Animal과 그 자식들 밖에 들어오지 못함.

        Dog biggerDog = AnimalMethod.bigger(dog1, dog2);//타입 추론, 입력-반환 타입이 모두 Dog으로 바뀜
        System.out.println("biggerDog = " + biggerDog);

        //AnimalMethod.<Dog>bigger(dog1,cat);//타입 인수로 Dog을 넣었기 때문에 cat은 못들어옴.
        Animal bigger = AnimalMethod.bigger(dog1, cat1);//섞어서 넣으면 부모 타입으로 추론
    }
}
