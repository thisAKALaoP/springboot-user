package com.jk.service;

import com.jk.entity.UserEntity;

import java.util.List;

/**
 * @BelongsProject: springboot-user
 * @BelongsPackage: com.jk.service
 * @Author: 杨帅
 * @CreateTime: 2022-10-24  14:22
 * @Description: TODO
 * @Version: 1.0
 */
public interface UserService {

    public List<UserEntity> getUserList(UserEntity user);

    void addUser(UserEntity user);

    void updateUser(UserEntity user);

    void deleteUserById(Integer id);

    UserEntity getUserById(Integer id);
}


