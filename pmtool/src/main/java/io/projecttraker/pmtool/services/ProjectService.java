package io.projecttraker.pmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.projecttraker.pmtool.domain.Project;
import io.projecttraker.pmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;


    public Project saveOrUpdateProject(Project project)
    {
        // Logic 
        
        return projectRepository.save(project);
    }
}
