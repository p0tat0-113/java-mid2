package collection.re1.map;

import java.util.*;

public class JavaMap {
    public static void main(String[] args) {
        //Map과 Set은 value만 빼면 거의 똑같다.
        //실제로 자바의 Set은 내부적으로 Map의 구현을 그냥 갖다 씀.
        //Map은 당연히 Key값 중심으로 작동한다. Value는 어디까지나 Key에 껴묻혀가는 것 뿐이다.
        //Key를 가지고 해시 코드를 얻고, 저장하는 것이기 때문에 Key로 들어가는 객체는 반드시 equals() hashCode()를 오버라이딩 해야한다.

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new LinkedHashMap<>();
        Map<String, Integer> map3 = new TreeMap<>();//얘도 레드 블랙 트리 구조를 사용함. 자연순서 대로 정렬하거나 생성자를 통해 넣은 Comparator를 사용해서 정렬한다.

        run(map1);
        run(map2);
        run(map3);

        TreeMap<String, Integer> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        });//Comparator가 역순으로 정렬하게 함.

        run(treeMap);
    }

    private static void run(Map<String,Integer> map){
        map.put("C",3);
        map.put("A",1);
        map.put("B",2);
        System.out.println(map);
    }

}
