package generic.re1.animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
