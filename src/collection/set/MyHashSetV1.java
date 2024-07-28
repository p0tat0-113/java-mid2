package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<Integer>[] buckets;
    private int size; //set안에 실제 데이터가 몇개 들어가 있는지 기록
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets(capacity);
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets(capacity);
    }

    private void initBuckets(int capacity) {//배열에 연결리스트를 채워넣는다.
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value){//데이터 추가 성공 여부를 반환
        int hashIndex = hashIndex(value);

        LinkedList<Integer> bucket = buckets[hashIndex];//O(1)
        if(bucket.contains(value)){//O(n)이긴 한데 사실상 O(1)에 가까움
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue){//데이터 존재 여부를 반환
        int hashIndex = hashIndex(searchValue);

        LinkedList<Integer> bucket = buckets[hashIndex];//O(1)
        return bucket.contains(searchValue);//O(n)이긴 한데 사실상 O(1)에 가까움
    }

    public boolean remove(int value){//데이터 삭제 성공 여부를 반환
        int hashIndex = hashIndex(value);

        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value));//그냥 int형으로 넣으면 인덱스로 접근해서 삭제하는 메서드가 나와버림. 래퍼클래스로 변경해서 넣어야 한다.
        if (result == true){//O(n)이긴 한데 사실상 O(1)에 가까움
            size--;//삭제가 됐다면 size를 하나 줄여줌
        }
        return result;
    }

    public int getSize() {
        return size;
    }

    private int hashIndex(int value){
        return value % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
