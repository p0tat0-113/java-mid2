package generic.test.ex2;

/*
문제 설명
다음 코드와 실행 결과를 참고해서 UnitUtil 클래스를 만들어라.
UnitUtil.maxHp() 메서드의 조건은 다음과 같다.
두 유닛을 입력 받아서 체력이 높은 유닛을 반환한다. 체력이 같은 경우 둘 중 아무나 반환해도 된다.
제네릭 메서드를 사용해야 한다.
입력하는 유닛의 타입과 반환하는 유닛의 타입이 같아야 한다
 */

import generic.test.ex2.unit.BioUnit;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T t1, T t2){//상한선을 걸어야 BioUnit의 기능을 쓸 수 있음.
        return t1.getHp() > t1.getHp() ? t1:t2;
    }
    //예전이라면 타입별로 메서드를 따로 만들거나, Object타입으로 다형성으로 처리를 했을 것이다.
    //타입별로 만들면 코드의 재사용성이 떨어짐, Object로 만들면 타입 안정성이 떨어지고 내부에서 Object의 기능밖에 못쓴다.
    //그래서 제네릭을 도입해서 재사용성과 타입 안정성을 확보, 추가로 타입 매개변수 상한선 제한까지 걸어서 내부에서 BioUnit의 기능을 쓸 수 있게 함.
}
