package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    //WildcardEx.<Dog>printGenericV1() 이렇게 하면 T가 Dog이 돼서 Box<Dog> box 밖에 못들어옴
    //WildcardEx.printGenericV1(Box<Dog> box) 이렇게 해도 타입 추론에 의해서 T가 Dog이 된다.
    static <T> void printGenericV1(Box<T> box){//제네릭 메서드의 T와 인수 Box<T>의 T는 지금 같은 T다.
        System.out.println("T = "+box.get());
    }
    //와일드카드, ?에 어떤 타입이든 다 들어올 수 있다.
    static void printWildcardV1(Box<?> box){
        //이것은 제네릭 메서드가 아니다. 일반적인 메서드다.
        System.out.println("? = "+box.get());
    }


    static <T extends Animal> void printGenericV2(Box<T> box){//Animal로 상한을 걸었기 때문에 Box에도 Animal밖에 못들어감.
        T t = box.get();
        System.out.println("이름 = "+t.getName());
    }
    static void printWildcardV2(Box<? extends Animal> box){//와일드 카드로 들어올 수 있는 타입에 제한을 걸 수 있음.
        Animal animal = box.get();
        System.out.println("이름 = "+animal.getName());
    }


    static <T extends Animal> T printAndReturnGeneric(Box<T> box){//Animal로 상한을 걸었기 때문에 Box에도 Animal밖에 못들어감.
        T t = box.get();
        System.out.println("이름 = "+t.getName());
        return t;//얘는 box.get()얻은 것을 반환까지 함.
    }
    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        //얘는 제네릭 메서드가 아니다. 그렇기 때문에 반환 타입을 바꿀 수가 없음. 와일드 카드만으로는 해결이 안되는 케이스
        //제네릭 메서드는 타입 매개변수로 여기저기 타입을 다 바꾸면서 쓸 수 있지만, 와일드 카드는 그런 것이 아님. 그냥 들어온대로 쓰는거다. 일반 메서드랑 똑같음.
        Animal animal = box.get();
        System.out.println("이름 = "+animal.getName());
        return animal;
    }

    /* 와일드 카드는 제네릭 타입이나, 제네릭 메서드를 선언하는게 아니다. 제네릭 타입을 더 편하게 써먹으려고 하는 것 뿐
    타입 인자가 정해진 제네릭 타입을 활용할 때 사용을 한다. 코드를 봐도 Box<Dog>을 받고 있음.
    와일드 카드인 ?는 모든 타입을 다 받을 수 있다는 것이다. Object타입을 받는다고 해석하면 됨.
    ?만 사용해서 제한 없이 모든 타입을 다 받을 수 있는 와일드 카드를, 비제한 와일드 카드라고 한다.*/
}
