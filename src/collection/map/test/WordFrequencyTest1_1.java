package collection.map.test;

/*문제 설명
각각의 단어가 나타난 수를 출력해라
실행 결과
{orange=1, banana=2, apple=3}*/

import java.util.HashMap;

public class WordFrequencyTest1_1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        String[] fruits = text.split(" ");//문자열을 배열로 변환

        HashMap<String, Integer> map = new HashMap<>();

        //getOrDefault(key,defaultValue); 맵에 해당 키 값이 없으면 대신 반환할 기본값을 지정할 수 있음.
        for (String fruit : fruits) {
            map.put(fruit,map.getOrDefault(fruit,0)+1);
        }

        System.out.println(map);
    }
}
