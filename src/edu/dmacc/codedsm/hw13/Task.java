package edu.dmacc.codedsm.hw13;

public class Task {
    public String task;
    public String priorityLevel;
    public String deadline;
    public String assignedUser;
    public boolean complete;

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Task(String task, String assignedUser, String priorityLevel, String deadline, boolean complete) {
        this.task = task;
        this.assignedUser = assignedUser;
        this.priorityLevel = priorityLevel;
        this.deadline = deadline;
        this.complete = complete;
        this.assignedUser = assignedUser;
    }

    public Task() {
        task= "Add tasks.";
        assignedUser = "You";
        priorityLevel = "Low";
        deadline = "ASAP";
        complete = false;
    }

    @Override
    public String toString() {
        return "Task: " + task +
                ", Assigned User: " + assignedUser +
                ", Priority Level: " + priorityLevel +
                ", Deadline: " + deadline +
                ", Complete? " + complete;
    }
}
