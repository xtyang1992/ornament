package com.ornament.controller;

import com.ornament.domain.Measure;
import com.ornament.service.MeasureService;
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
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * 功能概要：UserController
 *
 * @author linbingwen
 * @since  2015年9月28日
 */
@Controller
public class CollectionController {
    @Resource
    private MeasureService measureService;

    @ResponseBody
    @RequestMapping(value = "/finance/collection", method = PUT)
    public Map<String, Object> createCollection(HttpSession session, @RequestParam String collectionDate,
                                     @RequestParam String collectionWay, @RequestParam int collectionItem,
                                     @RequestParam float collectionValue, @RequestParam float collectionRate){

        Map<String, Object> map = new HashMap<String, Object>();
        return map;
    }
}
