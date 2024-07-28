package generic.ex3;

import generic.animal.Cat;

public class CatHospital {//고양이만 받을 수 있는 고양이 병원, 개병원이랑 타입 빼고는 다 똑같음.

    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("동물 이름: "+animal.getName());
        System.out.println("동물 크기: "+animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target){//개를 인수로 받아서 크기 비교 후, 더 큰 놈을 반환
        return animal.getSize() > target.getSize() ? animal : target;//삼항 연산자
    }
}
