package com.capstone.backend.repository;

import com.capstone.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void deleteUserById(Long id);

    Optional<User> findUserById(Long id);

    Optional<User> findUserByEmail(String email);

    //login method
    User findByUserId(Long id);
}
