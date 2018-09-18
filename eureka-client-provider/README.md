# eureka-client-provider

使用 华为云 `eureka 高可用集群 `, 示例 provider 生产者

### 配置 

依赖 `pom.xml`
```xml
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
    <java.version>1.8</java.version>
    <spring-cloud.version>Finchley.SR1</spring-cloud.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>
  </dependencies>
```
* 配置 `application.yaml `

```yaml
server:
  port: ${SERVER_PORT: 8989}
spring:
  application:
    name: default-eureka-provider
eureka:
  client:
    serviceUrl:
      defaultZone: http://49.4.95.115:8761/eureka/ # 如果是集群内部建议使用 http://sc-ek001:8761/eureka/
    fetch-registry: false
  instance:
    prefer-ip-address: true

```

* 添加注解 `@EnableEurekaClient`

```java

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaClientProviderApplication.class, args);
  }
}

```
* 添加示例 controller , `EurekaSampleController.java`

```java
@RestController
public class EurekaSampleController {

  @Value("${server.port}")
  String port;

  @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
  public String hello(){
    return "hello, huawei. There is cse with port : " + port ;
  }
}

```

* 启动该项目,可以去 eureka 查看实例注册情况.

![provider](../readme/yun_provider.png)
