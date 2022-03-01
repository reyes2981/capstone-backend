package com.capstone.backend.controller;

import com.capstone.backend.model.User;
import com.capstone.backend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
@AllArgsConstructor
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> loginUser(@RequestBody User user) {
        User NewUser = userRepository.findByUserId(user.getId());
        if (user.getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok(user);
        }
        return null;
    }

}
