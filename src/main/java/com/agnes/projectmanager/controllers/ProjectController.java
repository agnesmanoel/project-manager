package com.agnes.projectmanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agnes.projectmanager.models.project.ProjectDTO;
import com.agnes.projectmanager.services.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping
    public List<ProjectDTO> findAll(){
        return projectService.findAll();
    }

    @GetMapping("/{id}")
    public ProjectDTO find(@PathVariable Long id){
        return projectService.find(id);
    }

    @PostMapping
    public void saveProject(@RequestBody ProjectDTO project){
        projectService.save(project);

    }
    
}