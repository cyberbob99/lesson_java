package task14;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = TaskManager.getInstance();
        manager.addTask("Помыть посуду");
        manager.addTask("Сделать ДЗ");
        manager.addTask("Позвонить маме");

        manager.markDone(3);

        manager.printAllTasks();
    }
}
