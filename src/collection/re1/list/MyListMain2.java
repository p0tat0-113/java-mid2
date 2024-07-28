package collection.re1.list;

import collection.re1.array.MyArrayList;
import collection.re1.link.MyLinkedList;

public class MyListMain2 {
    public static void main(String[] args) {
        BatchProcessor batchProcessor1 = new BatchProcessor(new MyArrayList<>());//런타임 의존 관계
        batchProcessor1.process(50_000);

        batchProcessor1.setList(new MyLinkedList<>());//런타임 의존 관계는 프로그램 실행 중에 계속 바뀔 수 있다.
        batchProcessor1.process(50_000);

        //BatchProcessor는 내부에서 추상적인 인터페이스 MyList에 의존하고 있다.
        //그래서 인스턴스 생성 시점에 생성자를 통해서, 구현체를 주입, 즉 의존 관계를 주입할 수 있음.
    }
}
