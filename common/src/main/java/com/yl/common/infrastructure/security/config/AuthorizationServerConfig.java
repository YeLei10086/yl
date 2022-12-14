package com.yl.common.infrastructure.security.config;

import com.google.common.base.Predicates;
import com.yl.common.utils.CommonConstant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author YeLei
 * @Date 2022/09/21 20:23
 * @Version 1.0
 */

@Configuration
public class AuthorizationServerConfig {

    /**
     * 注入swagger实例对象bean
     * @return
     */
    @Bean
    public Docket webApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("webApi").apiInfo(webApiInfo()).
                select().paths(Predicates.not(PathSelectors.regex("/error*"))).
                build().globalOperationParameters(getParameterList());
    }

    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder().title("叶磊 API 中心").description("spring boot 从零开始").version("1.0").build();
    }

    private List<Parameter> getParameterList(){
        ParameterBuilder clientIdTickt = new ParameterBuilder();
        List<Parameter> parameters = new ArrayList<Parameter>();
        clientIdTickt.name(CommonConstant.TOKEN_STR).description("请求令牌").modelRef(new ModelRef("String"))
                .parameterType("header").required(false).build();
        parameters.add(clientIdTickt.build());
        return parameters;
    }
}
