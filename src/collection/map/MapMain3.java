package collection.map;

import java.util.HashMap;

public class MapMain3 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        //학생 성적 데이터 추가
        map.put("studentA",50);
        System.out.println(map);

        //학생이 없는 경우에만 데이터 추가1
        if(!map.containsKey("studentA")){//containsKey()로 검사
            map.put("studentA",100);
        }
        System.out.println(map);

        //학생이 없는 경우에만 데이터 추가2 absent: 부재
        map.putIfAbsent("studentA",100);
        map.putIfAbsent("studentB",100);
        System.out.println(map);
    }
}
