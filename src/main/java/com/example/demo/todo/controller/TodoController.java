package com.example.demo.todo.controller;

import com.example.demo.todo.model.Todo;
import com.example.demo.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    // Create a new Todo
    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    // Get all Todos
    @GetMapping
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // Get a specific Todo
    @GetMapping("/{id}")
    public Optional<Todo> getTodoById(@PathVariable Long id) {
        return todoRepository.findById(id);
    }

    // Update a Todo
    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
        todo.setId(id);
        return todoRepository.save(todo);
    }

    // Delete a Todo
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);
    }
}
