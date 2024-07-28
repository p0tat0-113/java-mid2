package generic.re1.animal;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sound(){
        System.out.println("동물 소리");
    }

    public void checkUp(){
        System.out.println("name = " + name);
    }
}
