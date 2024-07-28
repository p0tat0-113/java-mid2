package generic.re1.genericType;

import generic.re1.animal.Animal;

public class AnimalHospital <T extends Animal>{
    //Animal과 그 자식 타입들을 수용할 수 있는 병원

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void process(){
        //Animal의 메서드들이 호출이 안됨. 왜지? 바로 타입 매개변수 제한을 걸지 않았기 때문이다.
        //내 의도는 타입 인자로 Animal과 그 자식들을 넣는 것이지만, 자바 입장에서는 타입 매개변수로 뭐가 들어올지 모른다. 그래서 일단 Object로 단정하고 봄.
        //그래서 타입 인자로 Animal과 그 자식들만 들어올 수 있게 <T extends Animal>로 타입 매개변수 제한을 걸어야 하는 것이다.
        //그러면 이제 T를 Animal이라고 가정하게 됨.
        //메서드의 매개변수도 Object parameter <- 이런식으로 두지 않고, 특정한 부모 타입을 지정하는 것과 같은 것이다. MyInterface parameter
        //막 너무 어렵게 생각할 것 없다. 그냥 메서드의 매개변수랑 비슷하다고 보면 됨.
        animal.checkUp();
        animal.sound();
    }
}
