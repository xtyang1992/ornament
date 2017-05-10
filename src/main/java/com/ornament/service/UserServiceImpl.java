package com.ornament.service;

import com.ornament.dao.UserDao;
import com.ornament.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenshuguo on 2017/5/9.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    /**
     * 根据账号查找用户
     * @param account
     * @return
     */
    public User getUserByAccount(Integer account) {
        return userDao.selectUserByAccount(account);
    }

    /**
     * 根据工号查找用户
     * @param userId
     * @return
     */
    public User getUserById(String userId) {
        return userDao.selectUserById(userId);
    }

}
