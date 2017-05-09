package com.ornament.service;

import com.ornament.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by chenshuguo on 2017/5/9.
 */
@Service
public interface UserService {
    Integer selectUserByAccount(Integer account);
}
