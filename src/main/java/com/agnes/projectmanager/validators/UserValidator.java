package com.agnes.projectmanager.validators;

import org.springframework.stereotype.Component;
import com.agnes.projectmanager.exceptions.UserNotValidException;
import com.agnes.projectmanager.models.user.UserDTO;

@Component
public class UserValidator {

    public static void validate(UserDTO userDTO){

        if(userDTO.userName() == null || userDTO.userName().equals("")){
            throw new UserNotValidException("User name field is empty");
         }

         
         if(userDTO.userNumber() == null || userDTO.userNumber().equals("")){
            throw new UserNotValidException("User number field is empty");
         }


         if(userDTO.userBirthDate() == null){
            throw new UserNotValidException("User birth date field is empty");

         }

         if(!userDTO.userHasAgreed()){
            throw new UserNotValidException("User must agree to register");
         }


    }


}