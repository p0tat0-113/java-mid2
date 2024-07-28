package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object o){
        if(size == elementData.length){//배열이 꽉 찼으면
            grow();//배열의 길이를 늘림
        }
        elementData[size] = o;
        size++;
    }

    public void add(int index, Object o){
        if(size == elementData.length){//배열이 꽉 찼으면
            grow();//배열의 길이를 늘림
        }
        shiftRightFrom(index);//index부터 오른쪽으로 한칸씩 이동
        elementData[index] = o;
        size++;
    }

    private void shiftRightFrom(int index){
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    private void grow(){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        //길이를 늘린 새로운 배열을 만들고, 기존 배열을 복붙
        elementData = Arrays.copyOf(elementData,newCapacity);
        //새로운 길이로 배열을 만들고, 기존 배열의 값을 새로운 배열에 복사함.
        //내부에서 System.arraycopy로 고속 복사함.
    }

    public void remove(int index){
        shiftLeftFrom(index);//index로부터 왼쪽으로 한칸씩 땡김
        elementData[size-1] = null;
        size--;
    }

    private void shiftLeftFrom(int index){
        for (int i = index+1; i < size; i++) {
            elementData[i-1] = elementData[i];
        }
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
