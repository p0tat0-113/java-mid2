package generic.re1.genericMethod;

import generic.re1.animal.Animal;

public class Method2 <T extends Animal>{

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T returnAnimal(){
        return animal;
    }

    //이렇게 제네릭 타입과 제네릭 메서드가 타입 매개변수가 이름이 같은 경우에
    //메서드 안에서는 제네릭 메서드의 타입 매개변수가 우선순위를 가진다.
    //근데 그냥 서로 이름을 다르게 짓는게 혼동도 안가고 가장 베스트임.
    public <T extends Animal> void genericPrintAnimal(T animal){
        animal.getName();
        animal.sound();
        animal.checkUp();
    }
}
