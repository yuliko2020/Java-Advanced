package lesson20200903_TaskForProgrammer;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * JavaAdvanced
 * 03/09/2020
 */
public class Main {
    public static void main(String[] args) {

        Task task1 = new Task(1, Status.NOTACCEPTED, "xxxxx", Priority.HIGH);
        Task task2 = new Task(2, Status.READY, "zzzzz", Priority.LOW);
        Task task3 = new Task(3, Status.NOTACCEPTED, "yyyyyy", Priority.HIGH);
        Task task4 = new Task(4, Status.NOTACCEPTED, "uuuuu");
        Task task5 = new Task(5, Status.NOTACCEPTED, "wwwww", Priority.NORMAL);

        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);


        Queue<Task> queue = TaskHandler.taskQueue(tasks);
        //System.out.println(queue);
        System.out.println("--------------");
        Task iTask = queue.poll();
        while (iTask !=null){
            System.out.print(iTask);
            iTask = queue.poll();
        }
        System.out.println(queue);

    }
}
