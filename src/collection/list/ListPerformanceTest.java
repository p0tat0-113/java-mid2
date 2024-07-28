package collection.list;

//자바가 제공하는 리스트 성능 비교

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;

        System.out.println("==배열리스트 추가==");
        addFirst(new ArrayList<Integer>(),size);
        addMid(new ArrayList<Integer>(),size);//찾는데 O(1), 데이터 추가(밀기) O(n)

        ArrayList<Integer> arrayList = new ArrayList<>();//검색 속도 테스트 용
        addLast(arrayList,size);//찾는데 O(1), 데이터 추가(밀기) O(1)

        System.out.println("==연결리스트 추가==");
        addFirst(new LinkedList<Integer>(),size);
        addMid(new LinkedList<Integer>(),size);//찾는데 O(n), 데이터 추가 O(1)

        LinkedList<Integer> linkedList = new LinkedList<>();//검색 속도 테스트 용
        addLast(linkedList,size);//찾는데 O(n), 데이터 추가 O(1)


        int loop = 10000;
        System.out.println("==배열 리스트 조회==");//항상 O(1)
        getIndex(arrayList,loop,0);//맨앞
        getIndex(arrayList,loop,size/2);//중간
        getIndex(arrayList,loop,size-1);//맨뒤

        System.out.println("==연결 리스트 조회==");//O(n)
        getIndex(linkedList,loop,0);//맨앞
        getIndex(linkedList,loop,size/2);//중간
        getIndex(linkedList,loop,size-1);//맨뒤

        System.out.println("==배열 리스트 검색==");//O(n)
        search(arrayList,loop,0);//맨앞
        search(arrayList,loop,size/2);//중간
        search(arrayList,loop,size-1);//맨뒤

        System.out.println("==연결 리스트 검색==");//O(n)
        search(linkedList,loop,0);//맨앞
        search(linkedList,loop,size/2);//중간
        search(linkedList,loop,size-1);//맨뒤
    }

    private static void addFirst(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: "+size+" 계산시간: "+(endTime-startTime)+"ms");
    }

    private static void addMid(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2,i);//계속 대충 중간 쯤 넣어줌.
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: "+size+" 계산시간: "+(endTime-startTime)+"ms");
    }

    private static void addLast(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);//맨 뒤에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: "+size+" 계산시간: "+(endTime-startTime)+"ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index){//인덱스를 통해 접근
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: "+index+" 반복: "+loop+ " 계산시간: "+(endTime-startTime)+"ms");
    }

    private static void search(List<Integer> list, int loop, int num){//인덱스를 통해 접근
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(num);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("num: "+num+" 반복: "+loop+ " 계산시간: "+(endTime-startTime)+"ms");
    }
}
