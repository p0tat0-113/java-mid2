package collection.re1.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Task> queue = new ArrayDeque<>();

    public void addTask(Task task){
        queue.offer(task);
    }

    public int getRemainingTasks(){
        return queue.size();
    }

    public void processNextTask(){
        queue.poll().execute();
    }
}
