package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by 李印锋 on 2019/2/24 0:51
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getUsers(){
        return userMapper.getUsers();
    }
}
