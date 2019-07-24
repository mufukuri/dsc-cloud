package com.example.todoapp.service;

import com.example.todoapp.model.Todo;

import java.util.List;

public interface TodoService {
    void createTodo(Todo todo);
    List<Todo> findAll();
    Todo findTodoById(String taskId);
    Todo updateTodo(Todo todo);
    List<Todo> findAllByOrderByCreatedAsc();

    void updateTodos(List<Todo> todos);
}
