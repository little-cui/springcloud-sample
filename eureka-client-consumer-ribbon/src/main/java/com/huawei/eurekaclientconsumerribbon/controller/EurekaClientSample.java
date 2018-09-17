package com.huawei.eurekaclientconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaClientSample {

  @Autowired
  private RestTemplate restTemplate;

  private static final String PROVIDER_HELLO_URL_PREFIX = "http://default-eureka-provider";

  @RequestMapping("/sayHello")
  public String sayHello() {
    String url = PROVIDER_HELLO_URL_PREFIX + "/sayHello";
    String hello = restTemplate.getForObject(url, String.class);

    return hello == null ? "ERROR" : hello;
  }
}
