package com.capstone.backend.service;

import com.capstone.backend.model.Task;

import java.util.List;

public interface TaskService   {

    Task saveTask(Task task);
    Task getTask(Long id);
    List<Task> getTasks();
}
