package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3(2);

        numberList.add(1);
        numberList.add(2);
        numberList.add("3");
        System.out.println(numberList);

        //Object를 반환하기 때문에 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);
        Integer num3 = (Integer) numberList.get(2);//캐스팅 예외 발생

        //아무 타입이나 다 담기기 때문에 타입안정성이 떨어짐.
        //그럼 제네릭으로 코드 재사용성, 타입 안정성 둘 다 챙겨야 겠지?
    }
}
