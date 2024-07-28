package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        //AnimalHospitalV3<Integer> integerAnimalHospitalV3 = new AnimalHospitalV3<Integer>();//컴파일 에러 발생
        //Animal과 그 자식들만 들어올 수 있다.

        Dog dog = new Dog("dog", 10);
        Cat cat = new Cat("cat", 7);

        //개병원
        dogHospital.set(dog);
        dogHospital.checkUp();
        //고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        //문제1: 개 병원에 고양이 넣기
        //dogHospital.set(cat);//컴파일 에러 발생. dogHospital에는 Dog만 들어감.

        //문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("biggerDog", 20));//Dog으로 반환하기 때문에 캐스팅 안해도 됨.
        System.out.println("biggerDog = " + biggerDog);

        //제네릭을 도입하고 제네릭의 타입 매개변수에 제한을 걸었다.
        //타입 안전성을 지키면서 상위 타입의 원하는 기능까지 사용할 수 있었다.
        //덕분에 코드 재사용과 타입 안전성이라는 두 마리 토끼를 동시에 잡을 수 있었다.
    }
}
