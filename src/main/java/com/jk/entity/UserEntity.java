package com.jk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @BelongsProject: springboot-user
 * @BelongsPackage: com.jk.entity
 * @Author: 杨帅
 * @CreateTime: 2022-10-24  14:24
 * @Description: TODO
 * @Version: 1.0
 */
@TableName(value = "t_user")
@Data
public class UserEntity implements Serializable {

    @TableId(value="user_id", type = IdType.AUTO)
    private Integer userId;
    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "user_account")
    private String userAccount;
    @TableField(value = "user_pwd")
    private String userPwd;
}


