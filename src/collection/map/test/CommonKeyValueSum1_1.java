package collection.map.test;

/*문제 설명
map1 과 map2 에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라.*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CommonKeyValueSum1_1 {
    public static void main(String[] args) {
        //이렇게 편하게 Map을 만들 수 있음.
        //Map.of()가 HashMap이긴 한데 조금 다른 HashMap을 반환한다고 한다.
        //얘가 반환하는 Map은 불변이라서 내용을 변경할 수 없다고 함.
        Map<String, Integer> map1 = Map.of("A",1,"B",2,"C",3);
        Map<String, Integer> map2 = Map.of("B",4,"C",5,"D",6);

        // 코드 작성
        HashMap<String, Integer> newMap = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)){//map1과 map2에 공통으로 있는 키만 걸러냄.
                newMap.put(key,map1.get(key)+map2.get(key));//각 map에서 값을 조회해서 더함.
            }
        }

        System.out.println(newMap);
    }
}
