package task14;

public class Task {

    String title;
    TaskStatus status = TaskStatus.NEW;

    Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "[" + status + "] " + title;

    }
}
