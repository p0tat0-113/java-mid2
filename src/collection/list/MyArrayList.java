package collection.list;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> implements MyList<E> {//제네릭 도입
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;//입력과 출력타입은 타입 매개변수로 하기 때문에 얘네는 Object여도 상관없음.
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void add(E o){
        if(size == elementData.length){//배열이 꽉 찼으면
            grow();//배열의 길이를 늘림
        }
        elementData[size] = o;
        size++;
    }

    @Override
    public void add(int index, E o){
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

    @Override
    @SuppressWarnings("unchecked")//경고를 무시, 애노테이션 주석
    public E get(int index){
        return (E) elementData[index];
        //여기에서는 다운캐스팅을 해줘야함. 어차피 입력 타입이 E라서 배열에는 다 E타입만 들어있기 때문에 안전한다.
    }

    @Override
    public E set(int index, E o){
        E oldValue = get(index);
        elementData[index] = o;
        return oldValue;
    }

    @Override
    public E remove(int index){
        E oldValue = get(index);
        shiftLeftFrom(index);//index로부터 왼쪽으로 한칸씩 땡김
        elementData[size-1] = null;
        size--;
        return oldValue;
    }

    private void shiftLeftFrom(int index){
        for (int i = index+1; i < size; i++) {
            elementData[i-1] = elementData[i];
        }
    }

    @Override
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)){
                return i;
            }
        }
        return -1;//없으면 -1 반환
    }

    private void grow(){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        elementData = Arrays.copyOf(elementData,newCapacity);
    }

    @Override
    public String toString(){
        //size만큼만 배열로 출력
        return Arrays.toString(Arrays.copyOf(elementData,size))
                + " size = "+ size
                + " capacity = " + elementData.length;
        //Arrays.copyOf() 배열을 길이만큼 잘라서 반환
    }
}
