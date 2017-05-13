package com.ornament.service;

import com.ornament.dao.CollectionDao;
import com.ornament.dao.ProjectDao;
import com.ornament.domain.Collection;
import com.ornament.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangxt25 on 2017/5/12.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectDao projectDao;

    public Integer addCollection(Float collectionPrice, Integer projectId){
        return projectDao.addCollection(collectionPrice, projectId);
    }
    public List<Project> getProjects(){
        return projectDao.getProjects();
    }
    public Project getProjectByName(String projectName){
        return projectDao.getProjectByName(projectName);
    }
}
