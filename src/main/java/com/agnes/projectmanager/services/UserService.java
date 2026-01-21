package com.agnes.projectmanager.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agnes.projectmanager.models.user.*;
import com.agnes.projectmanager.repositories.UserRepository;;


@Service
public class UserService {

    
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> findAll(){
        return null;     

    }

    public UserDTO findUser(Long id){
        return null;

    }

    public void save(UserDTO user){

    }

    public void delete(long id){

    }

}
