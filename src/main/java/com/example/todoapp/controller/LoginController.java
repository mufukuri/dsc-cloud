package com.example.todoapp.controller;


import com.example.todoapp.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {


    @GetMapping(value ={"/login","login"})
    public ModelAndView addToDo(ModelAndView modelAndView, HttpServletRequest request) {

        modelAndView.setViewName("login");
        return modelAndView;
    }


    @GetMapping("/access-denied")
    public String accessDenied() {
        return "/error/access-denied";
    }
}
