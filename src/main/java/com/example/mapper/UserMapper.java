package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Create by 李印锋 on 2019/2/24 0:49
 */

@Component
public interface UserMapper {
    @Select("select * from User")
    public List<User> getUsers();
}
