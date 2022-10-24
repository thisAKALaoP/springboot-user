package com.jk.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jk.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: springboot-user
 * @BelongsPackage: com.jk.dao
 * @Author: 杨帅
 * @CreateTime: 2022-10-24  17:07
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
@Repository
public interface UserDao extends BaseMapper<UserEntity> {
}
