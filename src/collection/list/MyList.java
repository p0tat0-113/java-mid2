package collection.list;

//리스트 인터페이스. 리스트에 필요한 추상 메서드들을 제공한다. 제네릭 타입으로 선언

public interface MyList<E> {

    int size();//실제 크기 반환

    void add(E e);//데이터 추가

    void add(int index, E e);//특정 인덱스에 데이터 삽입

    E get(int index);//특정 인덱스의 데이터 반환

    E set(int index,E e);//특정 인덱스의 데이터를 교체하고, 기존 데이터 반환

    E remove(int index);//특정 인덱스의 데이터 삭제

    int indexOf(E e);//데이터를 검색해서 해당 인덱스 반환
}
