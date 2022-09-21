package com.yl.common.application.login;

import com.yl.common.interfaces.outbond.dto.ResultDTO;
import com.yl.common.interfaces.outbond.login.ILogin;
import com.yl.common.interfaces.outbond.login.UserVO;
import org.springframework.web.bind.annotation.*;

/**
 * @Author YeLei
 * @Date 2022/09/21 19:55
 * @Version 1.0
 */

@RestController
@RequestMapping("/admin")
public class LoginController implements ILogin {
    @Override
    @PostMapping("/login")
    public ResultDTO<String> login(@RequestBody UserVO userVO) {
        ResultDTO<String> resultDTO = new ResultDTO<>();
        resultDTO.setObj("username: " + userVO.getUsername() + " ,password: " + userVO.getPassword());
        return resultDTO;
    }

    @Override
    @PostMapping("/logout")
    public ResultDTO<String> logout(@RequestBody UserVO userVO) {
        ResultDTO<String> resultDTO = new ResultDTO<>();
        resultDTO.setMassage("登出成功！");
        return resultDTO;
    }
}
