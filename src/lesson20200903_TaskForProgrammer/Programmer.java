package lesson20200903_TaskForProgrammer;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 03/09/2020
 */
public class Programmer {
    private String name;
    private List<Task> taskList;

    public Programmer(String name, List<Task> taskList) {
        this.name = name;
        this.taskList = taskList;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public List<Task> getTaskList(Status status) {
        List<Task> resList = new ArrayList<>();
        for (Task iTask : taskList) {
            if (iTask.getStatus().equals(Status.NOTACCEPTED)) {
                resList.add(iTask);
            }
        }

        return resList;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", taskList=" + taskList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Programmer that = (Programmer) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return taskList != null ? taskList.equals(that.taskList) : that.taskList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (taskList != null ? taskList.hashCode() : 0);
        return result;
    }
}
