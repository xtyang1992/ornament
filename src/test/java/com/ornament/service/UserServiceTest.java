package com.ornament.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ornament.baseTest.SpringTestCase;
import com.ornament.domain.User;

/**
 * 功能概要：UserService单元测试
 *
 * @author linbingwen
 * @since  2015年9月28日
 */
public class UserServiceTest extends SpringTestCase {
    @Autowired
    private UserService userService;
    Logger logger = Logger.getLogger(UserServiceTest.class);

    @Test
    public void selectUserByAccountTest(){
        User user = userService.selectUserByAccount(1);
        logger.debug("查找结果" + user);
    }


}
