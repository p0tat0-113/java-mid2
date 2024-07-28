package collection.map.test;

/*문제 설명
map1 과 map2 에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        // 코드 작성
        Set<String> keys = map1.keySet();
        keys.retainAll(map2.keySet());//두 맵의 key들만 Set으로 받아서 교집합

        HashMap<String, Integer> newMap = new HashMap<>();
        for (String key : keys) {
            int sum = 0;
            sum += map1.get(key);//각 맵에서 key값으로 value를 조회
            sum += map2.get(key);
            newMap.put(key,sum);
        }
        System.out.println(newMap);
    }
}
