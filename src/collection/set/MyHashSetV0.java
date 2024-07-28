package collection.set;

/*Set은 인덱스가 없기 때문에 데이터를 넣고, 데이터가 있는지 확인하고, 데이터를 삭제하는 기능만 넣으면 된다.
우선은 아주 단순하게 구현해 볼 것이다. 제대로 기능을 하게 하려면 해쉬 알고리즘을 적용해야 함.*/

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];//예제의 단순함을 위해 배열 사용
    private int size = 0;

    //contains()를 사용하기 때문에 O(n)
    public boolean add(int value){//값이 잘 들어갔는지 boolean 반환
        if (contains(value)){//중복된 값이 있는지 검사
            return false;
        }

        elementData[size] = value;
        size++;
        return true;
    }

    //전체를 순회해서 확인하기 때문에 O(n)
    public boolean contains(int value){//중복되는 값이 있는지 검사
        for (int data : elementData) {
            if (data == value){
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData,size)) +
                ", size=" + size +
                '}';
    }
}
