package lesson20200903_TaskForProgrammer;

/**
 * JavaAdvanced
 * 03/09/2020
 */
public class Task implements Comparable <Task> {
    private int id;
    private Status status;
    private String description;
    private Priority priority;


    public Task(int id, Status status, String description) {
        this(id, status, description, Priority.LOW);

        //  this.id = id;
        //  this.status = status;
        //  this.description = description;
        //  this.priority=Priority.LOW;
    }

    public Task(int id, Status status, String description, Priority priority) {
        this.id = id;
        this.status = status;
        this.description = description;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\nid=" + id +
                ", status=" + status +
                ", description='" + description + ", priority: " + priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != task.id) return false;
        if (status != task.status) return false;
        return description != null ? description.equals(task.description) : task.description == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Task o) {
        return 0;
    }
}
