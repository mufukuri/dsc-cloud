package com.example.todoapp.service;

import com.example.todoapp.model.Todo;
import com.example.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public void createTodo(Todo todo) {
        todoRepository.save(todo);
    }


    public List<Todo> findAll() {
        return (List<Todo>) todoRepository.findAll();

    }



    @Override
    public Todo findTodoById(String taskId) {
        return todoRepository.findById(taskId).orElse( new Todo());
    }

    @Override
    public Todo updateTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> findAllByOrderByCreatedAsc() {
        return todoRepository.findAllByOrderByCreatedAsc();
    }

    @Override
    public void updateTodos(List<Todo> todos) {
        todoRepository.saveAll(todos);
    }
}
