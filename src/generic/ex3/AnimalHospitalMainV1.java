package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {

        //AnimalHospitalV1은 내부에서 Animal타입을 사용한다.
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("dog", 10);
        Cat cat = new Cat("cat", 7);

        //개병원
        dogHospital.set(dog);
        dogHospital.checkUp();
        //고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        //문제1: 개 병원에 고양이 넣기
        dogHospital.set(cat);//개 병원에 고양이가 들어가짐. 매개변수 체크 실패: 컴파일 에러가 발생하지 않음.

        //문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("biggerDog", 20));//Animal 타입으로 반환됨. 위험한 캐스팅을 시도해야함.
        //개를 넣으면 아무 문제 없지만, 문제는 고양이를 넣었을 때이다. 고양이를 넣어도 컴파일 에러는 발생하지 않음. 캐스팅중 캐스팅 예외가 발생한다.
        //타입 안정성이 떨어짐.
        System.out.println("biggerDog = " + biggerDog);

        // 코드 재사용성은 올라갔지만, 타입 안정성이 나빠짐.
        // 이제 여기에서 제네릭을 도입해보자.
    }
}
