package com.yl.common.interfaces.outbond.login;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author YeLei
 * @Date 2022/09/21 20:57
 * @Version 1.0
 */

@Data
@ApiModel(value = "UserVO",description = "用户登录类")
public class UserVO {

    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "密码")
    private String password;

}
