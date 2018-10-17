package com.huawei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HuaweiClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(HuaweiClientApplication.class, args);
  }
}
