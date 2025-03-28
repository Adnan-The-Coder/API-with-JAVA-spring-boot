package com.example.demo.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Todo {

    @Id
    private Long id;
    private String task;
    private boolean completed;

    public Todo() {}

    public Todo(Long id, String task, boolean completed) {
        this.id = id;
        this.task = task;
        this.completed = completed;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
