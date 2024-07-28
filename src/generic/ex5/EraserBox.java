package generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object object){
        //return object instanceof T;
        return false;
    }

    public void create(){
        //return new T();
    }

    /*이런 경우 다 컴파일 에러가 발생함. 이레이저 때문.
    이 상태에서 컴파일을 하게 되면 타입 정보가 다 제거되고, 상한으로 지정된 Object로 바뀌어버림.
    때문에 항상 object instanceof Object, 항상 true가 되고
    항상 new Object()가 된다. 이레이져 때문에 개발자의 의도와는 완전히 달라진다.*/
}
