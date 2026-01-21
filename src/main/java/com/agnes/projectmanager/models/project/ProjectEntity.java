package com.agnes.projectmanager.models.project;

import java.time.LocalDate;
import com.agnes.projectmanager.models.user.UserEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProjectEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String projectName;
    LocalDate startDate;
    LocalDate finalDate;
    
    @ManyToOne
    UserEntity responsibleUser;


    public void assignUser(UserEntity user){
        this.responsibleUser = user;

    }



}
