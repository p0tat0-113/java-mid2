package collection.map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        //학생 성적 데이터 추가
        map.put("studentA",90);
        System.out.println(map);

        //중복된 key값의 데이터 추가
        map.put("studentA",100);//같은 key에 저장시 기존 value 교체
        System.out.println(map);

        //특정 key를 가지고 있는지 검사
        boolean containsKey = map.containsKey("studentA");
        System.out.println(containsKey);

        //특징 key의 데이터 삭제
        map.remove("studentA");
        System.out.println(map);
    }
}
