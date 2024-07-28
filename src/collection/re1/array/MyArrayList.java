package collection.re1.array;

import collection.re1.list.MyList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList <T> implements MyList<T> {

    private final int DEFAULT_CAPACITY = 6;
    private int capacity;//배열의 용량

    private int size = 0;//배열에 실제로 들어있는 데이터의 수

    private Object[] array;//타입 매개변수로 인스턴스를 생성하는게 불가능해서 Object타입을 사용함. 대신 입력을 다 T타입으로 받고, 출력할 때도 T타입으로 다운캐스팅 하면 된다.

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        initArray(capacity);
    }

    public MyArrayList() {
        capacity = DEFAULT_CAPACITY;
        initArray(capacity);
    }

    private void initArray(int capacity){
        array = new Object[capacity];
    }

    private void grow(){//배열의 크기를 늘릴 필요가 있는지 검사한 후, 배열의 크기를 2배로 늘림.
        if (size >= capacity){
            capacity *= 2;//배열의 길이를 2배로 늘림.
            array = Arrays.copyOf(array, capacity);
        }
    }

    @Override
    public void add(T value){//맨 뒤에 데이터를 추가 O(1)
        grow();
        array[size++] = value;
    }

    @Override
    public void add(int index, T value){//해당 인덱스에 데이터를 삽입, 데이터를 밀어야 해서 O(n)
        grow();
        shiftRight(index);
        array[index] = value;
        size++;
    }

    private void shiftRight(int index){//데이터를 오른쪽으로 한 칸 씩 밀어주는 메서드, O(n)
        for (int i = array.length-1; i > index; i--) {
            array[i] = array[i-1];
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T remove(int index){//데이터를 땡겨야 해서 O(n)
        T deletedValue = (T) array[index];
        shiftLeft(index);
        size--;
        return deletedValue;
    }

    private void shiftLeft(int index){//데이터를 왼쪽으로 한 칸 씩 땡기는 메서드, O(n)
        for (int i = index; i < size-1; i++) {
            array[i] = array[i+1];
        }
    }

    @Override
    public T get(int index){//O(1)
        return (T) array[index];
    }

    @Override
    public T set(int index, T value){//해당 인덱스의 값을 바꿔치기 함. 기존 값을 반환. O(1)
        T oldValue = (T) array[index];//array가 Object타입이기 때문에 다운캐스팅 해줘야함.
        array[index] = value;
        return oldValue;
    }

    @Override
    public int indexOf(T value){//해당 데이터의 첫번째 인덱스를 반환, 못찾으면 -1 반환
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "array=" + Arrays.toString(Arrays.copyOf(array,size)) +
                " capacity=" + capacity +
                ", size=" + size;
    }

    //사용자가 내부 구현에 대해 알 필요 없이 간편하게 순회할 수 있도록, Iterable, Iterator를 구현함.
    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();//Iterator 인스턴스를 반환
    }

    //MyArrayListIterator는 MyArrayList에서 밖에 쓰지 않기 때문에 내부 클래스로 구현함.
    private class MyArrayListIterator implements Iterator<T> {//바깥 클래스의 타입 매개변수 T를 MyArrayListIterator에서도 그대로 사용
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < size){
                return true;
            }
            return false;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            return (T)array[index++];
        }
    }

    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>(2);
        System.out.println(arrayList);

        arrayList.add(1);
        System.out.println(arrayList);
        arrayList.add(2);
        System.out.println(arrayList);
        arrayList.add(3);
        System.out.println(arrayList);

        arrayList.add(2,1000);
        System.out.println(arrayList);
        arrayList.add(3,2000);
        System.out.println(arrayList);

        System.out.println("arrayList.get(4) = " + arrayList.get(4));
        System.out.println("arrayList.indexOf(2000) = " + arrayList.indexOf(2000));

        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);


        for (Integer integer : arrayList) {//Iterable을 구현했기 때문에 향상된 for문으로 순회 가능
            System.out.print(integer+" ");
        }
        System.out.println();

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println(arrayList.iterator().getClass());

    }
}
