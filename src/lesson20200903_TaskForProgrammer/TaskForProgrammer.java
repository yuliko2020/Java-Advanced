package lesson20200903_TaskForProgrammer;

/**
 * JavaAdvanced
 * 03/09/2020
 */
public class TaskForProgrammer {
    Task task;
    Programmer programmer;

    public TaskForProgrammer(Task task, Programmer programmer) {
        this.task = task;
        this.programmer = programmer;
    }

    public Task getTask() {
        return task;
    }

    public Programmer getProgrammer() {
        return programmer;
    }

    @Override
    public String toString() {
        return "task: " + task +"programmer: "+ programmer.getName() ;
    }



}
