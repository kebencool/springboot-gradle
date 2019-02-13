package com.example.springbootgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//创建服务注册中心
@EnableEurekaServer//开启Eureka Server
@SpringBootApplication
public class SpringbootGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGradleApplication.class, args);
    }

}

