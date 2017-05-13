package com.ornament.service;

import com.ornament.domain.Collection;
import com.ornament.domain.Project;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenshuguo on 2017/5/9.
 */
@Service
public interface ProjectService {
    Integer addCollection(Float collectionPrice, Integer projectId);
    List<Project> getProjects();
    Project getProjectByName(String projectName);
}
