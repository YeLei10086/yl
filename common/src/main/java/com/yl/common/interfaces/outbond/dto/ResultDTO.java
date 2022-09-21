package com.yl.common.interfaces.outbond.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author YeLei
 * @Date 2022/09/21 21:07
 * @Version 1.0
 */

@Data
@ApiModel(value = "返回的结果集")
public class ResultDTO<T>  extends BaseDTO{

    @ApiModelProperty(value = "返回的业务数据")
    private T obj;
}
