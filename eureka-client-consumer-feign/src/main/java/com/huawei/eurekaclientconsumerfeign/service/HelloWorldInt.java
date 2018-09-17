package com.huawei.eurekaclientconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Component
@FeignClient("default-eureka-provider")
public interface HelloWorldInt {

  @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
  String sayHello();

}
