package com.jk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jk.dao.UserDao;
import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: springboot-user
 * @BelongsPackage: com.jk.service.impl
 * @Author: 杨帅
 * @CreateTime: 2022-10-24  17:06
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> getUserList(UserEntity user) {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        List<UserEntity> list = userDao.selectList(wrapper);
        return list;
    }

    @Override
    public void addUser(UserEntity user) {
        userDao.insert(user);
    }

    @Override
    public void updateUser(UserEntity user) {
        userDao.updateById(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return userDao.selectById(id);
    }
}


