package com.example.todoapplication.service;

import com.example.todoapplication.model.Todo;
import com.example.todoapplication.respository.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

@Service
public class TodoService {

    Logger log = LoggerFactory.getLogger(TodoService.class);

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Iterable<Todo> getTodos() {

        log.info("looping through the database ");
        Iterable<Todo> todos = todoRepository.findAll();
        Iterator<Todo> iterator = todos.iterator();
        ArrayList<Todo> todoList = new ArrayList<Todo>();

        while (iterator.hasNext()) {

        }
        return todos;

    }
}
