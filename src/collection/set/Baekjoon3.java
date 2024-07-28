package collection.set;

import java.util.*;

public class Baekjoon3 {

    //각 요소에 Integer[]를 담는 ArrayList를 Comparator를 이용해서 정렬할 것임.
    public static void main(String[] args) {
        process();
    }

    private static ArrayList<Integer[]> list = new ArrayList<>();

    private static void process(){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        //-100,000 ≤ x, y ≤ 100,000
        for (int i = 0; i < length; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();

            list.add(new Integer[]{key,value});
        }

        Collections.sort(list, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                /*if (o1[0] < o2[0]){
                    return -1;
                } else if (o1[0] > o2[0]) {
                    return 1;
                } else {//0번 인덱스 끼리 같다면
                    if (o1[1] < o2[1]){//2번 인덱스 끼리 비교 시작
                        return -1;
                    } else if (o1[0] > o2[1]) {
                        return 1;
                    } else {
                        return 0;
                    }
                }*/

                if (o1[0] == o2[0]){
                    return o1[1].compareTo(o2[1]);
                } else {
                    return o1[0].compareTo(o2[0]);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Integer[] integers : list) {
            sb.append(integers[0]+ " ");
            sb.append(integers[1]+"\n");
        }

        System.out.println(sb);
    }
}
