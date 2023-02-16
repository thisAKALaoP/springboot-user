package com.jk.entity;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("实体类")
public class UserEntity {
    private Integer id;
    private String devCode;
    private String mac;
    private String terminal;
    private Integer groupId;
    private String groupName;
    private String terName;
    private Integer status;
    private Integer bcState;
    private Integer id1;
    private Integer cycCount;
    private String bcContent;

}


