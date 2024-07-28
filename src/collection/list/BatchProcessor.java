package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;//추상적인 인터페이스 의존

    /*MyList는 자식타입인 MyArrayList와 MyLinkedList를 모두 받을 수 있다.
    생성자를 통해서 어떤 타입이 들어올지를 '미래로 미룰 수 있다'. 이걸 '의존관계 주입'이라고 한다.

    BatchProcessor를 생성하는 시점에 생성자를 통해서 원라는 리스트 전략을 선택해서 전달하면 된다.
    코드를 전혀 변경하지 않고 리스트 전략을 런타임에 지정할 수 있다.*/

    public BatchProcessor(MyList<Integer> list) {//의존성 주입
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가, 연결리스트의 경우 O(1)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: "+size+" 소요시간: "+(endTime-startTime)+"ms");
    }
}
