package com.yl.common.interfaces.outbond.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author YeLei
 * @Date 2022/09/21 21:04
 * @Version 1.0
 */

@Data
@ApiModel(value = "请求返回基本信息")
public class BaseDTO {

    /**
     * 状态码
     */
    @ApiModelProperty(value = "返回状态码")
    private Integer code = 200;

    /**
     * 返回信息
     */
    @ApiModelProperty(value = "返回信息")
    private String massage = "成功";
}
