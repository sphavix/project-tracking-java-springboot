package io.projecttraker.pmtool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.projecttraker.pmtool.domain.Project;
import io.projecttraker.pmtool.services.ProjectService;



@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @PostMapping("")
    public ResponseEntity<?> createProject(@RequestBody Project project, BindingResult result) {
        if(result.hasErrors()){
            return new ResponseEntity<String>("Invalid Project Object", HttpStatus.BAD_REQUEST);
        }

        Project project1 = projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project1, HttpStatus.CREATED);
    }
    
}
