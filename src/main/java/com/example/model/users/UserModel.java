package com.example.model.users;

import com.example.entity.User;
import com.example.model.BaseModel;

import java.util.List;

/**
 * Create by 李印锋 on 2019/2/24 0:48
 */
public class UserModel extends BaseModel {
    public List<User> data;

    public UserModel(int code, String msg, int count, List<User> users) {
        super(code, msg, count);
        this.data = users;
    }
}
