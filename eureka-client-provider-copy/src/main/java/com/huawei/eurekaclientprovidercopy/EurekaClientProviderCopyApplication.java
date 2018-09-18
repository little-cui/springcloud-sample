package com.huawei.eurekaclientprovidercopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientProviderCopyApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaClientProviderCopyApplication.class, args);
  }
}
