package com.huawei.eurekaclientprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // 允许动态刷新配置
@RestController
@Configuration
public class EurekaSampleController {

    @Value("${hello.huawei:error}")
    private String name;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String hello() {
        return name;
    }
}
