package collection.re1.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("studentA",90);
        map.put("studentB",80);
        map.put("studentC",80);
        map.put("studentD",100);
        System.out.println(map);//HashMap도 내부적으로 해시 자료구조를 사용하기 때문에 순서를 보장하지 않는다.

        System.out.println("map.get(\"studentA\") = " + map.get("studentA"));//key로 값 조회

        System.out.println("map.containsKey(\"studentA\") = " + map.containsKey("studentA"));

        map.putIfAbsent("studentA",100);//Map에 해당 키가 없으면 새로 집어넣음.
        System.out.println(map);

        map.put("studentA",100);//중복되는 키, 다른 값을 넣으면 값이 교체됨
        System.out.println(map);

        Set<String> keySet = map.keySet();//key를 Set에 담아서 반환
        for (String string : keySet) {
            System.out.println(string);
        }

        Collection<Integer> values = map.values();//중복은 허용하지만, 순서는 보장되지 않는 애매한 상태라서 Collection에 담아서 반환함.
        for (Integer value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();//Map은 내부적으로 Key와 Value의 쌍을 Entry객체에 담아서 보관을 한다. 이 Entry객체를 Set에 담아서 반환함.
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("key: "+entry.getKey()+", value: "+entry.getValue());
        }
    }
}
