package collection.re1.list;

public class BatchProcessor {
    private MyList<Integer> list;//추상적인 인터페이스에 의존, 컴파일 타임 의존관계

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;//생성자를 통해서 구체적인 구현체를 주입함. 의존 관계 주입. Dependency Injection
    }

    public void setList(MyList<Integer> list) {//setter로도 의존 관계를 주입할 수 있다.
        this.list = list;
    }

    public void process(int count){
        System.out.println("작업 시작");
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(0,100);
        }
        long end = System.currentTimeMillis();
        System.out.println("작업 종료, 소요 시간: "+(end-start)+"ms");
    }
}

