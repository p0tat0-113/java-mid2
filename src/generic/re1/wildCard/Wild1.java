package generic.re1.wildCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wild1 {
    //와일드 카드는 제네릭 타입이나, 제네릭 메서드 같은걸 새롭게 만드는게 아니다.
    //걔네를 갖다가 편하게 쓸 수 있게 해주는 것이다.
    //이미 타입 인자가 다 정해진 제네릭 타입을 전달 받아서 활용할 때 사용한다.
    //와일드 카드를 사용해서 더 일반적인 코드를 작성할 수 있고, 타입 안정성을 유지하면서도 다양한 타입을 지원할 수 있게됨.

    //예제로 List<Number> list를 입력받고, 반환하는 간단한 제네릭 메서드와, 와일드카드를 쓰는 간단한 일반 메서드를 만들었다.

    static <T extends Number> List<T> genericMethod(List<T> list) {
        System.out.println(list);
        return list;
    }

    //와일드 카드의 한계, wildCardMethod는 결국 일반 메서드일 뿐이다. 단지 매개변수로 제네릭 타입을 받는 것 뿐.
    //제네릭 메서드처럼 반환 타입을 동적으로 바꾸지는 못함.
    static List<?> wildCardMethod(List<? extends Number> list){//와일드카드에도 상한선을 걸 수 있다.
        System.out.println(list);
        return list;
    }

    static void test(/*? value*/){//이런건 안된다. 와일드 카드 "?" 는 어디까지나 제네릭 타입의 타입 인자를 나타내는 것 뿐, 타입 자체는 안된다.
    }

    public static void main(String[] args) {
        //genericMethod(new ArrayList<String>()); //둘 다 상한선을 Number로 걸었기 때문에 String은 들어오지 못한다.
        //wildCardMethod(new ArrayList<String>());

        List<Integer> returnedList1 = genericMethod(new ArrayList<>(List.of(1, 2, 3, 4, 5)));//이 부분에서 타입 추론이 발생. 제네릭 메서드의 타입 매개변수가 정해짐.
        List returnedList2 = wildCardMethod(new ArrayList<>(List.of(1, 2, 3, 4, 5)));//원시타입으로 받게됨.

        Integer integer1 = returnedList1.get(0);
        Integer integer2 = (Integer) returnedList2.get(0);//여기에서 와일드카드의 한계가 드러난다.
        //와일드 카드는 제네릭 메서드처럼 반환타입을 동적으로 바꿀 수 없다. 어디까지나 일반 메서드이기 때문.
        //따라서 반환타입도 와일드 카드에 걸어놓은 상한선 타입으로 고정된다.

    }

    //정리하자면 와일드 카드의 의의는 제네릭 타입을 전달받아서 사용할 때 좀 더 편리하고, 간단하게 사용할 수 있다는 점에 있다.
    //메서드의 반환타입을 동적으로 결정하려면 제네릭 메서드를 써야한다.
}
