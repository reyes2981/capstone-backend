package com.capstone.backend.service;

import com.capstone.backend.model.Task;

import java.util.Collection;
import java.util.List;

public interface TaskService   {

    Task create(Task task);
    Task get(Long id);
    Task update(Task task);
    Boolean delete(Long id);
    Collection<Task> list(int limit);
}
