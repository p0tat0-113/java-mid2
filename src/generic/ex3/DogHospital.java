package generic.ex3;

import generic.animal.Dog;

public class DogHospital {//개만 받을 수 있는 개병원

    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("동물 이름: "+animal.getName());
        System.out.println("동물 크기: "+animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target){//개를 인수로 받아서 크기 비교 후, 더 큰 놈을 반환
        return animal.getSize() > target.getSize() ? animal : target;//삼항 연산자
    }
}
