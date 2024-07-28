package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 0);//추상적인 클래스이지만 여기서는 직접 사용해봄
        Dog dog = new Dog("dog", 5);
        Cat cat = new Cat("cat", 3);

        Box<Animal> animalBox = new Box<>();//animalBox에는 Animal의 하위타입인 Dog, Cat도 받을 수가 있다.
        animalBox.setAnimal(animal);
        animalBox.setAnimal(dog);
        animalBox.setAnimal(cat);

        Animal findAnimal = animalBox.getAnimal();
        findAnimal.sound();//오버라이딩된 메서드 실행
    }
}
