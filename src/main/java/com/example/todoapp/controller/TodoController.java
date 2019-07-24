package com.example.todoapp.controller;

import com.example.todoapp.model.Todo;
import com.example.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/")
public class TodoController {


    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @GetMapping(value={"/home","/","home"})
    public ModelAndView index(ModelAndView modelAndView, HttpServletRequest request) {
        modelAndView.addObject("todos", this.todoService.findAllByOrderByCreatedAsc());
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping(value={"/todo","todo"})
    public ModelAndView addToDo(ModelAndView modelAndView, HttpServletRequest request) {
        modelAndView.addObject("newTodo", new Todo());
        modelAndView.setViewName("todo");
        return modelAndView;
    }


    @GetMapping("/report")
    public ModelAndView viewReports(ModelAndView modelAndView, HttpServletRequest request) {

        modelAndView.setViewName("report");
        return modelAndView;
    }


    @PostMapping("/add")
    public String saveTodo(@ModelAttribute Todo newTodo) {
        todoService.createTodo(newTodo);
        return "redirect:/";
    }



}
