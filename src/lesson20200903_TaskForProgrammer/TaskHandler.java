package lesson20200903_TaskForProgrammer;

import java.util.*;

/**
 * JavaAdvanced
 * 03/09/2020
 */
public class TaskHandler {
    public static List<TaskForProgrammer> taskHandler(List<Programmer> programmers) {
        List<TaskForProgrammer> result = new ArrayList<>();
        for (Programmer iProgrammer : programmers) {
            List<Task> tempTask = iProgrammer.getTaskList(Status.NOTACCEPTED);
            for (Task iTask : tempTask) {
                result.add(new TaskForProgrammer(iTask, iProgrammer));
            }
        }

        return result;
    }

    public static Queue<Task> taskQueue(List<Task> tasks) {
        Queue<Task> result = new PriorityQueue<>(tasks);

        return result;

    }


}
