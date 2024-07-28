package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<Integer> intList = new MyArrayListV4<>(2);

        intList.add(1);
        intList.add(2);
        //intList.add("3"); //Integer만 들어감.
        intList.add(3);
        System.out.println(intList);

        //다운 캐스팅 필요 없음.
        Integer num1 = intList.get(0);
        Integer num2 = intList.get(1);
        Integer num3 = intList.get(2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        //제네릭을 사용한 덕분에 타입 인자로 지정한 타입으로만 안전하게 데이터를 저장하고, 조회할 수 있게 되었다
    }
}
