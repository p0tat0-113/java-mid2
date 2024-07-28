package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object o){
        //코드 추가
        if(size == elementData.length){//배열이 꽉 찼으면
            grow();//배열의 길이를 늘림
        }
        elementData[size] = o;
        size++;
    }

    //코드 추가
    private void grow(){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        //길이를 늘린 새로운 배열을 만들고, 기존 배열을 복붙
        elementData = Arrays.copyOf(elementData,newCapacity);
        //새로운 길이로 배열을 만들고, 기존 배열의 값을 새로운 배열에 복사함.
        //내부에서 System.arraycopy로 고속 복사함.
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object o){
        Object oldValue = elementData[index];
        elementData[index] = o;
        return oldValue;
    }

    public int indexof(Object o){
        for (int i = 0; i < size; i++) {
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
