package com.ornament.controller;

import com.ornament.domain.Collection;
import com.ornament.service.CollectionService;
import com.ornament.service.MeasureService;
import com.ornament.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * 功能概要：UserController
 *
 * @author linbingwen
 * @since  2015年9月28日
 */
@Controller
public class CollectionController {
    @Resource
    private CollectionService collectionService;
    @Resource
    private MeasureService measureService;

    @Resource
    private ProjectService projectService;

    @ResponseBody
    @RequestMapping(value = "/finance/collection", method = POST)
    public Map<String, Object> createCollection(HttpSession session, @ModelAttribute Collection collection){
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.print("aaaaaaaaaaaaaaaaaaaa"+collection);
        int result = collectionService.createCollection(collection);
        if(collection.getCollectionItem() == 1) {
            int num = measureService.createMeasure(collection.getCollectionId(), collection.getCollectionValue(), collection.getCollectionDate());
            if(num != 0 && result != 0) {
                map.put("status", 0);
            } else {
                map.put("status", 1);
            }
        } else {
            int num = projectService.addCollection(collection.getCollectionValue(), collection.getProjectId());
            if(num != 0 && result != 0) {
                map.put("status", 0);
            } else {
                map.put("status", 2);
            }
        }
        return map;
    }
}
