package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {

        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); //처음에는 O(1)
        set.add(2); //그 다음부터는 O(n)
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("set = " + set);

        boolean result = set.add(5);//중복된 값 저장
        System.out.println("result = " + result);//중복된 값이라 저장 실패
        System.out.println("set = " + set);

        System.out.println("set.contains(1) = " + set.contains(1));//O(n)
        System.out.println("set.contains(99) = " + set.contains(99));//O(n)

        //conatains()로 중복된 데이터가 있는지 검사할 때 성능이 O(n)으로 매우 나쁘다.
        //add()를 할 때마다 conatains()를 사용하기 때문에 add()도 성능이 매우 나쁨.
    }
}
