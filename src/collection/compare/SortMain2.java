package collection.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class SortMain2 {
    public static void main(String[] args) {
        //비교자
        Integer[] arr = {3,2,1};
        System.out.println(Arrays.toString(arr));

        System.out.println("==Comparator 비교==");

        Arrays.sort(arr,new AscComparator());//내부에서 비교자를 사용해서 반환값을 기반으로 정렬함.
        System.out.println("AscComparator 결과: "+Arrays.toString(arr));

        Arrays.sort(arr,new DescComparator());//내부에서 비교자를 사용해서 반환값을 기반으로 정렬함.
        System.out.println("DescComparator 결과: "+Arrays.toString(arr));

        Arrays.sort(arr,new AscComparator().reversed());//reversed(), DescComparator와 같아짐.
        System.out.println("AscComparator().reversed() 결과: "+ Arrays.toString(arr));
    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {//왼쪽 인수가 더 작은면 음수, 같으면 0, 오른쪽 인수가 더 크면 양수를 반환
            System.out.println("o1: "+o1+" o2:"+o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);//조건문이 중첩된거라고 보면 됨.
        }
    }

    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {//왼쪽 인수가 더 작은면 양수, 같으면 0, 오른쪽 인수가 더 크면 음수를 반환
            System.out.println("o1: "+o1+" o2:"+o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1)*-1;//-1을 곱해서 결과를 뒤집음
        }
    }
}
