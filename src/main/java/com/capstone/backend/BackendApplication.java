package com.capstone.backend;

import com.capstone.backend.model.Task;
import com.capstone.backend.model.User;
import com.capstone.backend.repository.TaskRepository;
import com.capstone.backend.repository.UserRepository;
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

//    @Bean
//    CommandLineRunner run(UserRepository userRepository) {
//        return args -> {
//            userRepository.save(new User(null, "lori123", "lori1@yahoo.com", "123"));
//            userRepository.save(new User(null, "bob87", "bob@yahoo.com", "123"));
//            userRepository.save(new User(null, "jose999", "jose@yahoo.com", "123"));
//            userRepository.save(new User(null, "margie23", "margie@yahoo.com", "123"));
//        };
 //   }

}
