package com.agnes.projectmanager.validators;

import com.agnes.projectmanager.exceptions.ProjectNotValidException;
import com.agnes.projectmanager.models.project.ProjectDTO;

public class ProjectValidator {

    public static void validate(ProjectDTO project){

        if(project.startDate().isAfter(project.finalDate())){
            throw new ProjectNotValidException("The start date cannot be after the end date.");
        }

        

    }
    
}