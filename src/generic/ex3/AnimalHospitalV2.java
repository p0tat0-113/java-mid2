package generic.ex3;

public class AnimalHospitalV2<T> {//제네릭 도입과 실패
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
        //T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용가능
        //T에 어떤 타입이 들어올지를 알 수 없기 때문에 메서드를 마음대로 호출할 수가 없음.

        animal.toString();//Object의 기능만 사용가능
        animal.equals(null);

        /*System.out.println("동물 이름: "+animal.getName()); //컴파일 에러 발생
        System.out.println("동물 크기: "+animal.getSize());
        animal.sound();*/
    }

    public T bigger(T target){
        /*return animal.getSize() > target.getSize() ? animal : target;*/
        return null;
    }
}
