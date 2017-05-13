package com.ornament.controller;

import com.ornament.domain.Project;
import com.ornament.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * 功能概要：UserController
 *
 * @author linbingwen
 * @since  2015年9月28日
 */
@Controller
public class ProjectController {
    @Resource
    private ProjectService projectService;

    @ResponseBody
    @RequestMapping(value = "/projects", method = GET)
    public Map<String, Object> createCollection(HttpSession session){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Project> result = projectService.getProjects();
        map.put("status", 0);
        map.put("data", result);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/project", method = GET)
    public Map<String, Object> getProjectByName(HttpSession session, @RequestParam String projectName){
        Map<String, Object> map = new HashMap<String, Object>();
        Project p = projectService.getProjectByName(projectName);
        if(p == null) {
            map.put("status", 1);
            map.put("data", "");
        } else {
            map.put("status", 0);
            map.put("data", p);
        }
        return map;
    }
}
