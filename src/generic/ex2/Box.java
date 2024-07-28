package generic.ex2;

public class Box<T> {//다양한　동물들을 담을 수 있는 박스

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}
