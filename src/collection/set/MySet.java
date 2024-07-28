package collection.set;

//공통 기능만 뽑아서 추상화, 제네릭 타입으로 만듦
//이 인터페이스를 구현하면 해시가 아니라 다른 자료 구조 기반의 set을 만들 수도 있음.

public interface MySet<E> {

    boolean add(E e);

    boolean contains(E e);

    boolean remove(E e);
}
