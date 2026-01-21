package com.agnes.projectmanager.validators;

import java.util.ArrayList;
import java.util.List;

import com.agnes.projectmanager.models.user.UserDTO;
import com.agnes.projectmanager.models.user.UserEntity;

public class UserMapper {

    public static UserEntity toEntity(UserDTO userDTO){

       UserEntity userEntity = new UserEntity();

       userEntity.setUserName(userDTO.userName());
       userEntity.setUserBirthDate(userDTO.userBirthDate());
       userEntity.setUserNumber(userDTO.userNumber());
       userEntity.setUserHasAgreed(userDTO.userHasAgreed());
       userEntity.setId(userDTO.id());

       return userEntity;

   }

    public static UserDTO toDTO(UserEntity userEntity) {

       UserDTO userDTO = new UserDTO(
           userEntity.getId(),
           userEntity.getUserName(),
           userEntity.getUserNumber(),
           userEntity.getUserBirthDate(),
           userEntity.isUserHasAgreed()

       );

       return userDTO;


   }

    public static List<UserDTO> toDTOList(List<UserEntity> userEntities) {

       List<UserDTO> userDTOList = new ArrayList<>();
       
       userEntities.forEach(userEntity -> {
           userDTOList.add(UserMapper.toDTO(userEntity));
       });

       return userDTOList; 
   }
   

   public static List<UserDTO> toEntityList(List<UserEntity> userEntities) {

       List<UserDTO> userEntityList = new ArrayList<>();
       
       userEntities.forEach(userDtolist -> {
           userEntityList.add(UserMapper.toDTO(userDtolist));
       });

       return userEntityList; 
   }
   
}