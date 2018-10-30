package com.huawei.eurekaclientconsumerfeign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class HelloWorldService {

    @Autowired
    HelloWorldIntf helloWorldIntf;

    @RequestMapping("/sayHello")
    public String sayHello() {
        String result = helloWorldIntf.sayHello();
        return result == null ? "ERROR" : "spring-cloud-provider: " + result;
    }
}
