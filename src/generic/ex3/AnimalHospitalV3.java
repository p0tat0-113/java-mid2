package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    //extends Animal로 T에 Animal과 그 자식들만 들어오게 제한을 걸 수 있다.
    //그 덕분에 이제는 Animal이 가진 메서드들을 쓸 수 있음!!!
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
        //이제 컴파일 에러가 발생하지 않음.
        //T가 Animal과 그 자식들로 제한되기 때문이다. T가 Animal이라고 가정을 해도 문제가 없음.
        System.out.println("동물 이름: "+animal.getName());
        System.out.println("동물 크기: "+animal.getSize());
        animal.sound();
    }

    public T bigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
