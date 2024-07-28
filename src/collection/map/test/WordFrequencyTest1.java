package collection.map.test;

/*문제 설명
각각의 단어가 나타난 수를 출력해라
실행 결과
{orange=1, banana=2, apple=3}*/

import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        String[] fruits = text.split(" ");//문자열을 ' '을 기준으로 배열로 변환

        HashMap<String, Integer> map = new HashMap<>();

        for (String fruit : fruits) {
            if (map.containsKey(fruit)){//map에 이미 해당 키가 있다면
                map.put(fruit,map.get(fruit)+1);//value에 1을 더함
            } else {//map에 해당 키가 없다면
                map.put(fruit,1);//새로 집어넣음
            }
        }

        System.out.println(map);
    }
}
