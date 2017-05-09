package com.ornament.dao;

import com.ornament.domain.User;

/**
 * Created by chenshuguo on 2017/5/9.
 */
public interface UserDao {

    /**
     *
     * @param account
     * @return
     */
    public Integer selectUserByAccount(Integer account);
}
