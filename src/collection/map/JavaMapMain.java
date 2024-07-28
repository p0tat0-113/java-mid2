package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map){
        System.out.println(map.getClass());

        map.put("C",10);
        map.put("B",20);
        map.put("A",30);
        map.put("1",40);
        map.put("2",50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();//반복자 반환
        while(iterator.hasNext()){//다음으로 꺼낼 데이터가 있는지 확인
            String key = iterator.next();//다음 데이터를 꺼냄
            Integer value = map.get(key);
            System.out.print(key+" = "+value+" ");
        }
        System.out.println();
    }
}
