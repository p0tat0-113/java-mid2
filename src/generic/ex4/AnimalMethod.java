package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {
    //ex3에서 만든 예제를 static메서드로 간단하게 만듦.

    public static <T extends Animal> void checkUp(T animal){
        System.out.println("동물 이름: "+animal.getName());
        System.out.println("동물 크기: "+animal.getSize());
        animal.sound();
    }

    public static <T extends Animal> T bigger(T animal1, T animal2){
        return animal1.getSize() > animal2.getSize() ? animal1 : animal2;
    }
}
