package generic.test.ex2;

/*
문제 설명
다음 코드와 실행 결과를 참고해서 Shuttle 클래스를 만들어라.
Shuttle 클래스의 조건은 다음과 같다.
제네릭 타입을 사용해야 한다.
showInfo() 메서드를 통해 탑승한 유닛의 정보를 출력한다.
 */

import generic.test.ex2.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T unit) {
        this.unit = unit;
    }

    public T out(){
        return unit;
    }

    public void showInfo(){
        System.out.println("이름: "+unit.getName() + " HP: " +unit.getHp());
        //타입 매개변수를 BioUnit으로 상한을 걸어야만 BioUnit의 기능을 쓸 수 있다.
    }
    //BioUnit의 자식들을 담을 수 있는 제네릭 타입
}
