package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {
    private Deque<Task> taskQueue = new ArrayDeque<>();

    public void addTask(Task task){//추상적인 인터페이스 Task에 의존, 후에 의존성 주입
        taskQueue.offer(task);
    }

    public int getRemainingTasks(){
        return taskQueue.size();
    }

    public void processNextTask(){
        Task task = taskQueue.poll();//큐에 있는 작업을 하나 꺼냄.
        if (task != null){//nullPointerException 예방
            task.execute();//객체의 오버라이딩 된 메서드 실행
        }
    }
}
