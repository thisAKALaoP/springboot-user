package com.jk.dao;

import com.jk.api.Result;
import com.jk.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserDao{
    //void selectList();

    List<UserEntity> selectUserList();

    UserEntity queryUserById(Integer id);

    boolean updateUser(UserEntity user);
}
