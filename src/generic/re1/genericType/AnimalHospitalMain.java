package generic.re1.genericType;

import generic.re1.animal.Cat;
import generic.re1.animal.Dog;

public class AnimalHospitalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이");
        Cat cat = new Cat("고양이");

        AnimalHospital<Dog> dogAnimalHospital = new AnimalHospital<>();
        AnimalHospital<Cat> catAnimalHospital = new AnimalHospital<>();

        dogAnimalHospital.setAnimal(dog);
        //dogAnimalHospital.setAnimal(cat);//당연히 안됨

        dogAnimalHospital.process();
    }
}
