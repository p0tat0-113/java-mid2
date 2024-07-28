package collection.re1.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet <T>{

    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private List<T>[] buckets;
    private int size = 0;

    public MyHashSet() {
        initBuckets(DEFAULT_CAPACITY);
    }

    public MyHashSet(int capacity) {
        initBuckets(capacity);
    }

    private void initBuckets(int capacity){
        buckets = new List[capacity];
        this.capacity = capacity;
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(T value){//O(1)
        int hashIndex = hashIndex(value);//O(1)

        List<T> bucket = buckets[hashIndex];//O(1)

        if (!bucket.contains(value)){//O(n) 해시충돌이 발생하면 O(n)이 됨. 하지만 해시충돌이 발생할 확률은 낮고, 발생한다 해도 버킷에 몇 개 들어있지 않기 때문에 괜찮음.
            //bucket.contains()에서 입력받은 객체의 equals()를 호출한다. 따라서 해시 자료구조에 넣으려면 반드시 equals()도 재정의 해야함.
            bucket.add(value);
            size++;
            return true;
        }
        return false;
    }

    public boolean contains(T value){
        int hashIndex = hashIndex(value);

        List<T> bucket = buckets[hashIndex];

        return bucket.contains(value);
    }

    public boolean remove(T value){
        int hashIndex = hashIndex(value);

        List<T> bucket = buckets[hashIndex];

        if(bucket.remove(value)){
            size--;
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private int hashIndex(T value){
        int hashCode = value.hashCode();//해시 코드를 얻어냄.
        int hashIndex = Math.abs(hashCode) % capacity;
        return hashIndex;
    }

    @Override
    public String toString() {
        return Arrays.toString(buckets);
    }

    public static void main(String[] args) {
        MyHashSet<Integer> set = new MyHashSet<>();

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        System.out.println(set);

        set.add(14);
        set.add(99);
        System.out.println(set);

        set.add(4);
        set.add(9);
        System.out.println(set);

        set.remove(4);
        set.remove(99);
        System.out.println(set);

        System.out.println(set.size());

        //직접 만든 객체를 해시 자료구조에 보관하려면 반드시 equals()와 hashCode()를 재정의 해야만 한다.
        Member hi = new Member("hi");//해시충돌
        Member jpa = new Member("JPA");//해시충돌
        Member java = new Member("java");
        Member spring = new Member("spring");

        MyHashSet<Member> hashSet = new MyHashSet<>();
        hashSet.add(hi);
        hashSet.add(jpa);
        hashSet.add(java);
        hashSet.add(spring);
        System.out.println(hashSet);
    }
}
