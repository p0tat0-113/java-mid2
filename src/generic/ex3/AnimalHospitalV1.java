package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV1 {
    private Animal animal;//여기서는 Dog,Cat 의 부모인 Animal을 사용함.
    //이 코드 하나로 Dog,Cat 둘 다 받을 수 있다.

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("동물 이름: "+animal.getName());
        System.out.println("동물 크기: "+animal.getSize());
        animal.sound();
        //getName,getSize,sound 은 다 Animal이 제공하는 메서드이기 때문에 아무 문제 없이 사용할 수 있음.
    }

    public Animal bigger(Animal target){//개를 인수로 받아서 크기 비교 후, 더 큰 놈을 반환
        return animal.getSize() > target.getSize() ? animal : target;//삼항 연산자
    }
}
