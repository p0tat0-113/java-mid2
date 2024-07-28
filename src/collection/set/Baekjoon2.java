package collection.set;

import java.util.*;

public class Baekjoon2 {

    //Map을 도입해서 조금 더 개선을 해봤는데, 시간은 딱히 줄어들지 않음.
    public static void main(String[] args) {
        process();
    }

    private static TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();

    private static void process(){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        //-100,000 ≤ x, y ≤ 100,000
        for (int i = 0; i < length; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();

            /*if (map.containsKey(key)){//맵에 해당 키가 이미 있다면
                map.get(key).add(value);
            } else {//맵에 해당 키가 없다면
                map.put(key, new ArrayList<>(List.of(value)));//키와, 같은 키를 가진 값들을 모두 함께 담을 ArrayList를 만들어서 넣어줌.
            }*/

            ArrayList<Integer> arrayList = map.getOrDefault(key, new ArrayList<>());
            arrayList.add(value);
            map.put(key,arrayList);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {//키와 값을 저장하는 Entry객체를 Set에 담아서 받음.
            ArrayList<Integer> valueList = entry.getValue();
            Collections.sort(valueList);
            for (Integer value : valueList) {
                sb.append(entry.getKey()+ " ");
                sb.append(value+"\n");
            }
        }

        System.out.println(sb);
        //System.out.println(map);
    }
}
