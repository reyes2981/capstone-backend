package com.capstone.backend.repository;

import com.capstone.backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findTaskById(Long id);

}
