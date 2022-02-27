package com.capstone.backend.repository;

import com.capstone.backend.model.Task;
import com.capstone.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Optional<Task> findTaskById(Long id);
}
