package com.jk.controller;

import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @BelongsProject: springboot-user
 * @BelongsPackage: com.jk.controller
 * @Author: 杨帅
 * @CreateTime: 2022-10-24  14:22
 * @Description: TODO
 * @Version: 1.0
 */
@RequestMapping(value = "/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserList")
    @ResponseBody
    public List<UserEntity> getUserList(UserEntity user) {
        return userService.getUserList(user);
    }

    @RequestMapping("addUser")
    @ResponseBody
    public void addUser(UserEntity user) {
        userService.addUser(user);
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public void updateUser(UserEntity user) {
        userService.updateUser(user);
    }

    @RequestMapping("deleteUserById")
    @ResponseBody
    public void deleteUserById(Integer id) {
        userService.deleteUserById(id);
    }

    @RequestMapping("getUserById")
    @ResponseBody
    public UserEntity getUserById(Integer id) {
        return userService.getUserById(id);
    }
}


