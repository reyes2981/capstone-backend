package com.capstone.backend.service;

import com.capstone.backend.exception.UserNotFoundException;
import com.capstone.backend.model.User;
import com.capstone.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User UpdateUser(User user) {
        return userRepository.save(user);
    }

    public User findUserById(Long id) {
        return userRepository.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id" + id + " was not found"));
    }

    public void deleteUser(Long id) {
        userRepository.deleteUserById(id);
    }


}
