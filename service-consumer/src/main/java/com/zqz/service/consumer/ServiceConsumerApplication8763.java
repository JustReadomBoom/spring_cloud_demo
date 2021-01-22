package com.zqz.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zqz
 * @Description:
 * @Date: Created in 17:37 2021/1/22
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class ServiceConsumerApplication8763 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerApplication8763.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
