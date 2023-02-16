package com.jk.service;

import com.jk.api.Result;
import com.jk.entity.UserEntity;

import java.util.List;


public interface UserService {
/*
    public List<UserEntity> getUserList(UserEntity user);

    void addUser(UserEntity user);

    void updateUser(UserEntity user);

    void deleteUserById(Integer id);

    UserEntity getUserById(Integer id);*/

    List<UserEntity> selectUserList();

    UserEntity queryUserById(Integer id);

    boolean updateUser(UserEntity user);
}


