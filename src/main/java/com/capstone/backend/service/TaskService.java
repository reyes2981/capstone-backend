package com.capstone.backend.service;

import com.capstone.backend.exception.UserNotFoundException;
import com.capstone.backend.model.Task;
import com.capstone.backend.model.User;
import com.capstone.backend.repository.TaskRepository;

import java.util.List;

public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    public Task findTaskById(Long id) {
        return taskRepository.findTaskById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id" + id + " was not found"));
    }

    public void deleteUser(Long id) {
        userRepository.deleteUserById(id);
    }




//    Task create(Task task);
//    Task get(Long id);
//    Task update(Task task);
//    Boolean delete(Long id);
//    Collection<Task> list(int limit);
}
