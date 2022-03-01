package com.capstone.backend.controller;

import com.capstone.backend.model.User;
import com.capstone.backend.repository.UserRepository;
import com.capstone.backend.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }



}

//ResponseEntity represents an HTTP response, including headers,
// body, and status. While @ResponseBody puts the return value into
// the body of the response, ResponseEntity also allows us to add headers
// and status code.