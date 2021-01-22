package com.zqz.service.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceEurekaApplication8761 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEurekaApplication8761.class, args);
    }

}
