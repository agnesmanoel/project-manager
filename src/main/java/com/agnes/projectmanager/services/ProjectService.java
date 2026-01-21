package com.agnes.projectmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agnes.projectmanager.models.user.UserEntity;
import com.agnes.projectmanager.repositories.ProjectRepository;
import com.agnes.projectmanager.repositories.UserRepository;
import com.agnes.projectmanager.validators.ProjectValidator;
import com.agnes.projectmanager.mappers.ProjectMapper;
import com.agnes.projectmanager.models.project.*;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    UserRepository userRepository; 

    public List<ProjectDTO> findAll(){
        return ProjectMapper.toListDTO(projectRepository.findAll());
    }

    public ProjectDTO find(Long id) {
        return ProjectMapper.toDTO(projectRepository.findById(id).orElseThrow());
    }

    public void save(ProjectDTO project){
        ProjectValidator.validate(project);
        UserEntity userEntity = userRepository.findById(project.responsibleUser().id()).orElseThrow();
        projectRepository.save(ProjectMapper.toEntity(project, userEntity));
    }

    public void delete(Long id){
        projectRepository.deleteById(id);
    }


}
