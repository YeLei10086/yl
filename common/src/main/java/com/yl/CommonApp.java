package com.yl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author YeLei
 * @Date 2022/09/21 19:23
 * @Version 1.0
 */

@SpringBootApplication
@EnableSwagger2
public class CommonApp {
    public static void main(String[] args) {
        SpringApplication.run(CommonApp.class);
    }
}
