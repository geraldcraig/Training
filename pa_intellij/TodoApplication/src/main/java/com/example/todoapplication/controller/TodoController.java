package com.example.todoapplication.controller;

import com.example.todoapplication.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    Logger log = LoggerFactory.getLogger(TodoController.class);

    @GetMapping("/")
    public String homePage(Model model) {

        model.addAttribute("tasks", todoService.getTodos());

        String name = "Gerald";
        model.addAttribute("myName", name);
        log.info("index page" + name);
        log.debug("there is a possible path error, page one is not able to load");
        return "index";
    }
}
