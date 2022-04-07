package com.capstone.backend;

import com.capstone.backend.model.User;
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
//            userRepository.save(new User("larry123", "larry@yahoo.com", "123", "USER"));
//            userRepository.save(new User("picard555", "pica@gmail.com", "123", "USER"));
//            userRepository.save(new User("hawker99", "hawk@aol.com", "123", "ADMIN"));
//            userRepository.save(new User("lucy88", "lucy23", "123", "ADMIN"));
//        };
//    }



}
