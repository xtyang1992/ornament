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
     *
     * @param account
     * @return
     */
    public User selectUserByAccount(Integer account) {
        return userDao.selectUserByAccount(account);
    }

}
