package com.coding.webapp.service;

import com.coding.webapp.controller.dto.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    public void doLogic(Task task){
        System.out.println("Task:" + task);
    }

}
