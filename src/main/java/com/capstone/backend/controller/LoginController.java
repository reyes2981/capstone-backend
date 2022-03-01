package com.capstone.backend.controller;

import com.capstone.backend.repository.model.User;
import com.capstone.backend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
@AllArgsConstructor
public class LoginController {


    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) {
        System.out.println(user);
        Optional<User> NewUser = userRepository.findUserById(user.getId());
        if (user.getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok(user);
        }
        //TODO create exception
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }

}
