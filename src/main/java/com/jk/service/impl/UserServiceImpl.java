package com.jk.service.impl;

import com.jk.api.Result;
import com.jk.dao.UserDao;
import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> selectUserList() {
        return userDao.selectUserList();
    }

    @Override
    public UserEntity queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }

    @Override
    public boolean updateUser(UserEntity user) {

        return userDao.updateUser(user);
    }

   /* @Override
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
    }*/
}


