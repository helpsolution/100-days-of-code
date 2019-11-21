package com.coding.webapp.controller;

import com.coding.webapp.controller.dto.Task;
import com.coding.webapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;


    @PostMapping("/tasks")
    public void createTask(@RequestBody Task task){

        taskService.doLogic(task);
    }

}
