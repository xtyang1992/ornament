package com.ornament.dao;

import com.ornament.domain.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenshuguo on 2017/5/9.
 */
public interface ProjectDao {
    /**
     *
     * @param collectionPrice, projectId
     * @return
     */
    public Integer addCollection(@Param("collectionPrice")Float collectionPrice, @Param("projectId")Integer projectId);

    public List<Project> getProjects();

    public Project getProjectByName(@Param("projectName")String projectName);
}
