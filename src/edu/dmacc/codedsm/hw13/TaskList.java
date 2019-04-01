package edu.dmacc.codedsm.hw13;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    public List<Object> taskList;

    public List<Object> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Object> taskList) {
        this.taskList = taskList;
    }

    public TaskList(List<Object> taskList) {
        this.taskList = taskList;
    }

    public TaskList() {
        taskList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Task List:" +
                taskList;
    }

    public void addTask(Object taskToAdd){
        taskList.add(taskToAdd);
    }

    public void viewTasks(){
        System.out.println(taskList);
    }
}
