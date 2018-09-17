package com.huawei.eurekaclientconsumerfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huawei.eurekaclientconsumerfeign.service.HelloWorldService;

@RestController
public class ConsumerSampleController {
  @Autowired
  HelloWorldService helloWorldService;

  @GetMapping("/sayHello")
  public String sayHello() {
    return helloWorldService.sayHello();
  }
}
