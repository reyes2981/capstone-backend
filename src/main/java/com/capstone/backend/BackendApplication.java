package com.capstone.backend;

import com.capstone.backend.model.Task;
import com.capstone.backend.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

//    @Bean
//    CommandLineRunner run(TaskRepository taskRepository) {
//        return args -> {
//            taskRepository.save(new Task(null, "read a book", Boolean.FALSE));
//            taskRepository.save(new Task(null, "write technical blog", Boolean.FALSE));
//            taskRepository.save(new Task(null, "work project", Boolean.FALSE));
//            taskRepository.save(new Task(null, "grade class projects", Boolean.FALSE));
//        };
//    }

}
