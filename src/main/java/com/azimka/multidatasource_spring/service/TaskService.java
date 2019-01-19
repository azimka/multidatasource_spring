package com.azimka.multidatasource_spring.service;

import com.azimka.multidatasource_spring.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public String getTaskDBInfo() {
        return taskRepository.getTaskDBInfo();
    }
}
