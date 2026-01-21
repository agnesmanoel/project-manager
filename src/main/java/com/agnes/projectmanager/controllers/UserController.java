package com.agnes.projectmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.agnes.projectmanager.models.user.UserDTO;
import com.agnes.projectmanager.services.UserService;

import java.util.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")

public class UserController {

    @Autowired
    private UserService userService;
    

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<UserDTO> findAll(){
        
        List<UserDTO> x = userService.findAll();
        return x;
        
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping({"/{id}"})
    public UserDTO findID(@PathVariable Long id){
        return userService.findUser(id);
    }

    @PostMapping 
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody UserDTO usuario){
        userService.save(usuario);

    }
    
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id){
        userService.delete(id);

    }
}