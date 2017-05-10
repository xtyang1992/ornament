package com.ornament.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.ornament.domain.User;
import com.ornament.service.UserService;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * 功能概要：UserController
 *
 * @author linbingwen
 * @since  2015年9月28日
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/test", method = GET)
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("index");
        User user = userService.getUserByAccount(1);
        mav.addObject("user", user);
        return mav;
    }

    @ResponseBody
    @RequestMapping(value = "/user/login", method = GET)
    public Map<String, Object> login(HttpSession session, @RequestParam String userId, @RequestParam String password){
        User user = userService.getUserById(userId);
        Map<String, Object> map = new HashMap<String, Object>();
        if(user == null) {
            map.put("code", 1);
        } else if(user.getPassword().equals(password)) {
            //登录成功
            session.setAttribute("user", user);
            map.put("status", 0);
            map.put("data", user);
        } else {
            map.put("status", 2);
        }
        return map;
    }

}
