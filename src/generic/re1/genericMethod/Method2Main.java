package generic.re1.genericMethod;

import generic.re1.animal.Dog;

public class Method2Main {
    public static void main(String[] args) {
        Method2<Dog> dogMethod2 = new Method2<>();
        dogMethod2.setAnimal(new Dog("멍멍이"));
        System.out.println(dogMethod2.returnAnimal());


    }
}
