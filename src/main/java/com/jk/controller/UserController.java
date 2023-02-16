package com.jk.controller;

import com.jk.api.Result;
import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping(value = "/user")
@RestController
@Api(tags = "接口")
public class UserController {

    @Autowired
    private UserService userService;
    @ApiOperation(value = "获取列表详细信息")
    @RequestMapping(path = "/selectUserList", method=RequestMethod.GET)
    public List<UserEntity> selectUserList() {
        return userService.selectUserList();
    }

   /* @RequestMapping("addUser")
    @ResponseBody
    public void addUser(UserEntity user) {
        userService.addUser(user);
    }*/
    @RequestMapping(path = "/queryUserById", method=RequestMethod.GET)
    public Result queryUserById(Integer id) {
        return Result.ok(userService.queryUserById(id));

    }
    @RequestMapping(path = "/updateUser", method=RequestMethod.PUT)
    @ApiOperation(value = "获取列表详细信息")
    @ApiImplicitParam(name = "id", value = "列表id", paramType = "Integer")
    public boolean updateUser(@RequestBody UserEntity user) {
        System.out.println(user);
        return userService.updateUser(user);
    }

    /*@RequestMapping("deleteUserById")
    @ResponseBody
    public void deleteUserById(Integer id) {
        userService.deleteUserById(id);
    }*/


}


