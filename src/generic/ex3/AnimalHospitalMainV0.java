package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("dog", 10);
        Cat cat = new Cat("cat", 7);

        //개병원
        dogHospital.set(dog);//당연히 Dog 외에 다른 타입은 못들어감. 타입 안정성 굳
        dogHospital.checkUp();
        //고양이 병원
        catHospital.set(cat);//당연히 Cat 외에 다른 타입은 못들어감. 타입 안정성 굳
        catHospital.checkUp();

        //문제1: 개 병원에 고양이 넣기
        //dogHospital.set(cat);//당연히 안됨. 컴파일 에러 발생. 타입 안정성 좋음.

        //문제2: 개 타입 반환
        Dog biggerDog = dogHospital.bigger(new Dog("biggerDog", 20));//개 타입으로 잘 반환됨. 위험한 다운캐스팅 시도 필요X
        System.out.println("biggerDog = " + biggerDog);

        // 이 코드에서는 개 병원과 고양이 병원을 각기 다른 타입을 사용하는 별도의 클래스로 만들었다.
        // 그래서 타입 안정성은 좋지만 코드 재사용성은 제로.
        // 다음 코드에서는 다형성을 사용해서 문제해결을 시도해볼 것임.
    }
}
