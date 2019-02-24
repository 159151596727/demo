package com.example.controller;

import com.example.util.Constant;
import com.example.entity.User;
import com.example.model.users.UserModel;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Create by 李印锋 on 2019/2/23 22:32
 */
@Controller
public class DemoController {
    @Autowired
    UserService userService;

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpSession httpSession;

    @RequestMapping("/{view}.html")
    public String view(@PathVariable String view){
        return view;
    }
    public UserModel returnEssays(List<User> users) {
        if (users != null) {
            return new UserModel(Constant.SUCCESS_CODE, "success",users.size(), users);
        }
        return new UserModel(Constant.ERROR_CODE, "error",0, null);
    }

    @RequestMapping("/getUsers")
    @ResponseBody
    public UserModel getUsers(){
        return returnEssays(userService.getUsers());
    }
}
