package com.yl.common.interfaces.outbond.login;

import com.yl.common.interfaces.outbond.dto.ResultDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Author YeLei
 * @Date 2022/09/21 19:47
 * @Version 1.0
 */

@Api(value = "登录接口")
public interface ILogin {

    @ApiOperation("/admin/login")
    ResultDTO<String> login(UserVO userVO);

    @ApiOperation("/admin/logout")
    ResultDTO<String> logout(UserVO userVO);
}
