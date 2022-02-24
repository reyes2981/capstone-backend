package com.capstone.backend.model;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

//class represents the response that is sent to user everytime they make a request to API
public class Response {

    protected LocalDateTime timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;
    protected String message;
    protected String developerMessage;
    protected Map<?, ?> data;
}
