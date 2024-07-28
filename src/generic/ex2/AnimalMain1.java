package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 0);//추상적인 클래스이지만 여기서는 직접 사용해봄
        Dog dog = new Dog("dog", 5);
        Cat cat = new Cat("cat", 3);

        //개만 들어갈 수 있는 박스
        Box<Dog> dogBox = new Box<>();
        dogBox.setAnimal(dog);
        System.out.println("dogBox.getAnimal() = " + dogBox.getAnimal());

        //고양이만 들어갈 수 있는 박스
        Box<Cat> catBox = new Box<>();
        catBox.setAnimal(cat);
        System.out.println("catBox.getAnimal() = " + catBox.getAnimal());

        Box<Animal> animalBox = new Box<>();//animalBox에는 Animal의 하위타입인 Dog, Cat 도 받을 수가 있다.
        animalBox.setAnimal(animal);
        System.out.println("animalBox.getAnimal() = " + animalBox.getAnimal());
    }
}
