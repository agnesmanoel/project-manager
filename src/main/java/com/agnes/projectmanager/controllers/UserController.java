package com.agnes.projectmanager.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.agnes.projectmanager.models.user.UserDTO;
import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    List<UserDTO> findAll(){
        return null;

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping({"/{id}"})
    public UserDTO findID(@PathVariable Long id){
        return null;
    }

    @PostMapping 
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody UserDTO usuario){
        

    }
    
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id){
        return;

    }

}
