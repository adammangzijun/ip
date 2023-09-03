import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> taskList;

    TaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void add(Task task){
        this.taskList.add(task);
    }

    public void delete(int taskNumber) {
        // change number to index
        taskList.remove(taskNumber - 1);
    }

    public int size() {
        return taskList.size();
    }

    public Task get(int taskNumber) {
        return taskList.get(taskNumber - 1);
    }

}