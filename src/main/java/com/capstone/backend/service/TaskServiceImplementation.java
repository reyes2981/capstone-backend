package com.capstone.backend.service;

import com.capstone.backend.model.Task;
import com.capstone.backend.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class TaskServiceImplementation implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public Task saveTask(Task task) {
        log.info("Saving a new task {} to the DB", task.getId());
        return taskRepository.save(task);
    }

    @Override
    public Task getTask(Long id) {
        return null;
    }

    @Override
    public List<Task> getTasks() {
        return null;
    }
}
