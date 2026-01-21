package com.agnes.projectmanager.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agnes.projectmanager.models.user.*;
import com.agnes.projectmanager.repositories.UserRepository;
import com.agnes.projectmanager.validators.UserMapper;;


@Service
public class UserService {

    
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> findAll(){

        
        return UserMapper.toDTOList(userRepository.findAll());     

    }

    public UserDTO findUser(Long id){
        return UserMapper.toDTO(userRepository.findById(id).orElseThrow());

    }

    public void save(UserDTO user){
        userRepository.save(UserMapper.toEntity(user));

    }

    public void delete(long id){
        userRepository.deleteById(id);

    }

}

