package com.agnes.projectmanager.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.agnes.projectmanager.exceptions.ProjectNotValidException;
import com.agnes.projectmanager.exceptions.UserNotValidException;


@RestControllerAdvice
public class ExceptionController {
    
    @ExceptionHandler(UserNotValidException.class)
    public ResponseEntity<String> noNameUser(UserNotValidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(ProjectNotValidException.class)
    public ResponseEntity<String> noNameUser(ProjectNotValidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

}
