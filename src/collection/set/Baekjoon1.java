package collection.set;

import java.util.*;

public class Baekjoon1 {
    private static Integer[] keys;
    private static ArrayList<LinkedList<Integer>> values;

    static final int RANGE = 200_001;
    static final int HALF_RANGE = 100_000;

    public static void main(String[] args) {
        input();

        StringBuilder sb = new StringBuilder();
        for (int key : keys) {
            sb.append(key+" ");
            LinkedList<Integer> value = values.get(key + HALF_RANGE);
            sb.append(value.remove(0)+"\n");
        }
        System.out.println(sb);
    }

    private static void input(){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        //-100,000 ≤ x, y ≤ 100,000
        keys = new Integer[length];
        values = new ArrayList<>();
        for (int i = 0; i < RANGE; i++) {
            values.add(new LinkedList<>());
        }

        for (int i = 0; i < length; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            keys[i] = key;
            values.get(key+HALF_RANGE).add(value);
        }

        Arrays.sort(keys);

        //중복된 키를 제거, 중복된 키로 values를 여러번 정렬하는 것을 막음
        //정말 최악의 경우 200_000길이의 리스트를 200_000번 정렬하게 될 수 있음.
        HashSet<Integer> hashSet = new HashSet<>(List.of(keys));
        /*for (int key : keys) {
            hashSet.add(key);
        }*/

        for (Integer integer : hashSet) {
            Collections.sort(values.get(integer+HALF_RANGE));
        }
    }
}
