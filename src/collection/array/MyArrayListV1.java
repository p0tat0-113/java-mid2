package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {//생성자 오버로딩, 최초 크기를 직접 지정할 수도 있게 함.
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object o){//배열에 값 집어넣음.
        elementData[size] = o;//size는 현재 배열에 들어가있는 데이터의 양
        size++;
    }

    public Object get(int index){//인덱스에 맞는 값을 꺼냄.
        return elementData[index];
    }

    public Object set(int index, Object o){//해당 인덱스의 기존 값을 새로운 값을 덮어씌우고, 기존 값을 반환함.
        Object oldValue = elementData[index];
        elementData[index] = o;
        return oldValue;
    }

    public int indexof(Object o){//입력 받은 데이터의 인덱스를 반환함.
        for (int i = 0; i < size; i++) {//배열을 순회하면서 탐색
            if (elementData[i].equals(o)){
                return i;
            }
        }
        return -1;//없으면 -1 반환
    }

    public String toString(){
        //size만큼만 배열로 출력
        return Arrays.toString(Arrays.copyOf(elementData,size))
                + " size = "+ size
                + " capacity = " + elementData.length;
        //Arrays.copyOf() 배열을 길이만큼 잘라서 반환
    }
}
