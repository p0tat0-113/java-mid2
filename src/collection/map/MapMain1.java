package collection.map;

import java.util.*;

public class MapMain1 {
    public static void main(String[] args) {

        //제네릭 타입도 key, value 각각 2가지를 넣어줘야 한다.
        HashMap<String, Integer> map = new HashMap<>();

        //학생 성적 데이터 추가
        map.put("studentA",90);
        map.put("studentB",80);
        map.put("studentC",80);
        map.put("studentD",100);
        System.out.println("map = "+map);//HashMap은 순서를 보장하지 않음.

        //특정 학생의 값 조회
        Integer result = map.get("studentA");
        System.out.println("studentA 키의 값 조회: " + result);

        System.out.println("==keySet() 활용 - 모든 key를 출력==");
        Set<String> keys = map.keySet();//key들을 Set으로 반환함. key값은 중복되지 않고, 순서도 보장되지 않음.

        System.out.println(keys);
        for (String key : keys) {
            System.out.println("key: "+key+", value: "+map.get(key));
        }

        System.out.println("==values() 활용==");
        Collection<Integer> values = map.values();//Collection타입으로 반환. value는 중복될 수는 있지만, 순서가 보장되지 않는다.

        System.out.println(values);
        for (Integer value : values) {
            System.out.println("value: "+value);
        }

        System.out.println("==entrySet() 활용==");
        //Map.Entry는 Map안에 있는 중첩 클래스
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        System.out.println(entries);
        for (Map.Entry<String, Integer> entry : entries) {
            //Entry는 key와 value를 저장하는 객체라고 보면 된다.
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key: " + key + ", value: " + value);
        }
    }
}
