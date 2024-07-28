package generic.re1.animal;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("애옹");
    }
}
