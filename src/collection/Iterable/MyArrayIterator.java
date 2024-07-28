package collection.Iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator {
    //배열의 "반복자" 구현

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
        //타겟 배열을 생성자로 받음
        //Iterator는 단독으로 사용할 수 없다.
    }

    @Override
    public boolean hasNext() {
        //System.out.println(currentIndex+" < "+(targetArr.length-1)+" = "+(currentIndex<(targetArr.length-1)));

        return currentIndex < targetArr.length-1;
        //currentIndex가 최대인덱스와 같아지면 fasle를 반환
    }

    @Override
    public Object next() {
        //System.out.println("next() 호출, currentIndex 1 증가: " + (currentIndex+1));

        return targetArr[++currentIndex];
        //currentIndex에 1을 먼저 더하고, 인덱스에 접근해서 값을 꺼내옴
        //next()에서 항상 1을 더하기 때문에 currentIndex의 초기값을 -1로 한 것이다.
    }
}
