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
import java.util.Map;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * 功能概要：UserController
 *
 * @author linbingwen
 * @since  2015年9月28日
 */
@Controller
public class MeasureController {
    @Resource
    private MeasureService measureService;

    @ResponseBody
    @RequestMapping(value = "/finance/measures", method = GET)
    public Map<String, Object> login(HttpSession session, @RequestParam Integer pageStart,
                                     @RequestParam String startDate, @RequestParam String endDate,
                                     @RequestParam Integer status){
        List<Measure> measures = measureService.getMeasures(pageStart, startDate, endDate, status);
        Map<String, Object> map = new HashMap<String, Object>();
        if(measures == null || measures.size() == 0) {
            map.put("status", 1);
        } else {
            map.put("status", 0);
            map.put("data", measures);
        }
        return map;
    }
}
