package com.agnes.projectmanager.mappers;

import java.util.ArrayList;
import java.util.List;
import com.agnes.projectmanager.models.project.ProjectDTO;
import com.agnes.projectmanager.models.project.ProjectEntity;
import com.agnes.projectmanager.models.user.UserEntity;

public class ProjectMapper {

    public static ProjectDTO toDTO(ProjectEntity projectEntity){

        ProjectDTO projectDTO = new ProjectDTO(
            projectEntity.getProjectName(),
            projectEntity.getStartDate(),
            projectEntity.getFinalDate(),
            UserMapper.toDTO(projectEntity.getResponsibleUser())
        );
        return projectDTO;

    }


    public static ProjectEntity toEntity(ProjectDTO projectDTO){
        ProjectEntity projectEntity = new ProjectEntity();
        projectEntity.setProjectName(projectDTO.projectName());
        projectEntity.setStartDate(projectDTO.startDate());
        projectEntity.setFinalDate(projectDTO.finalDate());
        projectEntity.setResponsibleUser(UserMapper.toEntity(projectDTO.responsibleUser()));
        return projectEntity;

    }


    public static List<ProjectDTO> toListDTO (List<ProjectEntity> listEntity){
        List<ProjectDTO> listDTO = new ArrayList<>();
        listEntity.forEach(projectEntity -> {
            listDTO.add(ProjectMapper.toDTO(projectEntity));
        });
        return listDTO;
    }



    static List<ProjectEntity> toEntity (List<ProjectDTO> listDTO){
        List<ProjectEntity> listEntity = new ArrayList<>();
        listDTO.forEach(projectDTOList -> {
        listEntity.add(ProjectMapper.toEntity(projectDTOList));
        });
        return listEntity;

    }


    public static ProjectEntity toEntity(ProjectDTO project, UserEntity userEntity) {
        ProjectEntity projectEntity = new ProjectEntity();
        projectEntity.setProjectName(project.projectName());
        projectEntity.setStartDate(project.startDate());
        projectEntity.setFinalDate(project.finalDate());
        projectEntity.assignUser(userEntity);
        return projectEntity;
    }
    
}