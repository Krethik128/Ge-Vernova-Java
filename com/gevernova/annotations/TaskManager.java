package com.gevernova.annotations;

public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task completed!");
    }
}
