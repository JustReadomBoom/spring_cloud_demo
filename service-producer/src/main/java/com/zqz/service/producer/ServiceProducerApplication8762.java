package com.zqz.service.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zqz
 * @Description:
 * @Date: Created in 17:02 2021/1/22
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceProducerApplication8762 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProducerApplication8762.class, args);
    }
}
