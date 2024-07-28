package collection.set;

//모든 타입을 저장할 수 있는 Set 구현
//bucket을 Object타입으로 함. 입출력도 Object타입, hashCode()를 호출해서 객체의 해시코드를 얻음.

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;//모든 타입의 객체를 다 받을 수 있게 할거임

    private int size; //set안에 실제 데이터가 몇개 들어가 있는지 기록
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets(capacity);
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets(capacity);
    }

    private void initBuckets(int capacity) {//배열에 연결리스트를 채워넣는다.
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object o){//데이터 추가 성공 여부를 반환
        int hashIndex = hashIndex(o);//O(1)

        LinkedList<Object> bucket = buckets[hashIndex];//O(1)
        if(bucket.contains(o)){//O(n)이긴 한데 사실상 O(1)에 가까움
            return false;
        }
        bucket.add(o);
        size++;
        return true;
    }

    public boolean contains(Object o){//데이터 존재 여부를 반환
        int hashIndex = hashIndex(o);//O(1)

        LinkedList<Object> bucket = buckets[hashIndex];//O(1)
        return bucket.contains(o);//O(n)이긴 한데 사실상 O(1)에 가까움
    }

    public boolean remove(Object o){//데이터 삭제 성공 여부를 반환
        int hashIndex = hashIndex(o);//O(1)

        LinkedList<Object> bucket = buckets[hashIndex];//O(1)
        boolean result = bucket.remove(o);
        if (result) {//O(n)이긴 한데 사실상 O(1)에 가까움
            size--;
        }
        return result;
    }

    public int getSize() {
        return size;
    }

    private int hashIndex(Object o){
        int hashCode = o.hashCode();
        return Math.abs(hashCode) % capacity;
        //객체의 hashCode()를 호출해서 해시코드를 구한 후, 해시인덱스를 구해서 반환한다.
        //그런데 해시코드값이 음수가 나올 수가 있다. 이러면 해시인덱스도 음수가 돼버림. 그래서 무조건 절댓값을 반환하게 함.
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
