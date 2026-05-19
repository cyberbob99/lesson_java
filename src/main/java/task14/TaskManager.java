package task14;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private static TaskManager instance;
    private final List<Task> tasks = new ArrayList<>();

    private TaskManager(){

    }
    public static TaskManager getInstance(){
        if(instance == null){
            instance = new TaskManager();
        }
        return instance;
    }

    public void addTask(String task){
        tasks.add(new Task(task));
    }
    public void markDone(int index){
        tasks.get(index - 1).setStatus(TaskStatus.DONE);
    }
    public void printAllTasks(){
        for (int i = 0; i < tasks.size(); i++){
            Task task = tasks.get(i);
            System.out.println("[" + (i + 1) + "] " + task.toString());
        }
    }


}
