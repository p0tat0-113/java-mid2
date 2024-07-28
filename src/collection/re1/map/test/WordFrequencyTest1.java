package collection.re1.map.test;

import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        HashMap<String, Integer> map = new HashMap<>();

        String[] fruitArr = text.split(" ");
        for (String fruit : fruitArr) {
            map.put(fruit,map.getOrDefault(fruit,0)+1);
        }
        System.out.println(map);
    }
}
