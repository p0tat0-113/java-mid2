package generic.test.ex2;

/*
문제 설명
앞서 문제에서 만든 Shuttle 을 활용한다.
다음 코드와 실행 결과를 참고해서 UnitPrinter 클래스를 만들어라.
UnitPrinter 클래스의 조건은 다음과 같다.
UnitPrinter.printV1() 은 제네릭 메서드로 구현해야 한다.
UnitPrinter.printV2() 는 와일드카드로 구현해야 한다.
이 두 메서드는 셔틀에 들어있는 유닛의 정보를 출력한다.
 */

import generic.test.ex2.unit.BioUnit;

public class UnitPrinter {

    //제네렉 메서드로 구현
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle){//들어오는 Shuttle 타입에 따라서 타입 추론이 일어남.
        T unit = shuttle.out();
        System.out.println("이름: "+unit.getName()+", HP: "+unit.getHp());
    }

    //와일드 카드로 구현
    public static void printV2(Shuttle<?> shuttle){
        BioUnit unit = shuttle.out();
        System.out.println("이름: "+unit.getName()+", HP: "+unit.getHp());
    }

    //얘네는 제네릭 타입 Shuttle을 이용하는 코드
}
