package collection.re1.list;

public interface MyList <T> extends Iterable<T> {
    void add(T value);

    void add(int index, T value);

    T remove(int index);

    T get(int index);

    T set(int index, T value);

    int indexOf(T value);

    int size();
}
