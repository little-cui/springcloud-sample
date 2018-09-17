package com.huawei.eurekaclientconsumerfeign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class HelloWorldService {

  @Autowired
  HelloWorldInt helloWorldInt;

  @RequestMapping("/sayHello")
  public String sayHello() {
    String result = helloWorldInt.sayHello();
    return result == null ? "ERROR" : result;
  }
}
