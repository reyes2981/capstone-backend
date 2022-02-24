package com.capstone.backend.service;

import com.capstone.backend.model.Task;
import com.capstone.backend.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class TaskServiceImplementation implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public Task create(Task task) {
        log.info("Saving a new task {} to the DB", task.getId());
        return taskRepository.save(task);
    }

    @Override
    public Task get(Long id) {
        log.info("Fetching task by id {}", id);
        return taskRepository.findById(id).get();
    }

    @Override
    public Task update(Task task) {
        log.info("updating a task {} in the DB", task.getId());
        return taskRepository.save(task);
    }

    @Override
    public Boolean delete(Long id) {
        log.info("Deleting task by ID {}", id);
        return Boolean.TRUE;
    }

    @Override
    public Collection<Task> list(int limit) {
        log.info("Fetching all tasks");
        return taskRepository.findAll(PageRequest.of(0, limit)).toList();
    }
}
