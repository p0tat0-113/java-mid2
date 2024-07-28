package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        //와일드 카드에 하한선을 걸 수 있다.

        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        //Animal 포함 상위 타입 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);
        //writeBox(dogBox); //하한이 Animal
        //writeBox(catBox);

        System.out.println("objectBox.get() = " + objectBox.get());
        System.out.println("animalBox.get() = " + animalBox.get());
    }

    static void writeBox(Box<? super Animal> box){//와일드 카드로는 Animal이상 급만 들어올 수 있음.
        box.set(new Dog("dog",10));//그래야지만 dog객체를 집어넣을 때 문제가 안생김.
    }
}
