package com.capstone.backend.exception;

public class TaskNotFoundException extends RuntimeException{
    public TaskNotFoundException(String message) {
        super(message);
    }
}
