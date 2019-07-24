package com.example.todoapp.repository;

import com.example.todoapp.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo,String> {
    List<Todo> findAllByOrderByCreatedAsc();
}
