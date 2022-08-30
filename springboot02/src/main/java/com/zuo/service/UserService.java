package com.zuo.service;

import com.zuo.dao.UserMapper;
import com.zuo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zuozuo
 * @Date 2022 08 29
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
