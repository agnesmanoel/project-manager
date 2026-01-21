package com.agnes.projectmanager.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class ProjectNotValidException extends RuntimeException {

    public ProjectNotValidException(String message){
        super(message);
    }

}
