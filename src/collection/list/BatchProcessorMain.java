package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        //MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor batchProcessor = new BatchProcessor(list);//의존관계 주입

        batchProcessor.logic(50_000);
        //데이터를 앞에 추가하는 경우 MyLinkedList 쪽이 훨씬 빠름
    }
}
