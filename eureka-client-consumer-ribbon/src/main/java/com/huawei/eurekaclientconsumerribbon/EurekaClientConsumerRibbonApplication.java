package com.huawei.eurekaclientconsumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientConsumerRibbonApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaClientConsumerRibbonApplication.class, args);
  }
}
