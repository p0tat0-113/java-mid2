package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogAnimalHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catAnimalHospitalV2 = new AnimalHospitalV2<>();

        //타입 인자로 아무 타입이나 다 넣어버릴 수도 있다. 동물 병원인데 Integer를 받는 이상한 상황이 벌어짐.
        AnimalHospitalV2<Integer> integerAnimalHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectAnimalHospitalV2 = new AnimalHospitalV2<>();

        /* 나는 최소한 Animal이나 그 자식 타입만 들어왔으면 좋겠음.
        발생한 문제들을 생각해보면 타입 매개변수를 Animal 로 제한하지 않았기 때문이다.
        만약 타입 인자가 모두 Animal과 그 자식만 들어올 수 있게 제한한다면 어떨까?
        이게 바로 '타입 매개변수 제한'이다. */
    }
}
