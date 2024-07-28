package collection.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {
    //MyUser를 id를 기준으로 비교하기 위해서 만든 Comaparator
    @Override
    public int compare(MyUser o1, MyUser o2) {
        return o1.getId().compareTo(o2.getId());//String의 compareTo() 사용
    }
}
