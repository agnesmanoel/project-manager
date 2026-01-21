package com.agnes.projectmanager.validators;

import org.springframework.stereotype.Component;
import com.agnes.projectmanager.exceptions.UserNotValidException;
import com.agnes.projectmanager.models.user.UserDTO;

@Component
public class UserValidator {

    public static void validate(UserDTO userDTO){

        if(userDTO.userName() == null || userDTO.userName().equals("")){
            throw new UserNotValidException("Campo nome do usário vazio");
         }

         
         if(userDTO.userNumber() == null || userDTO.userNumber().equals("")){
            throw new UserNotValidException("Campo número do usuário vazio");
         }


         if(userDTO.userBirthDate() == null){
            throw new UserNotValidException("Campo data do usúario vazio");

         }

         if(!userDTO.userHasAgreed()){
            throw new UserNotValidException("Usuário deve concordar em se cadastrar");
         }


    }


}