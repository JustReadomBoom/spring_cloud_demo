package com.zqz.service.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zqz
 * @Description:
 * @Date: Created in 18:01 2021/1/22
 */
@Service
public class ConsumerTestService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public Object doGetProducerContent(String name) {
        return restTemplate.getForObject("http://SERVICE-P-ONE/get/port?name=" + name, String.class);
    }


    private String hiError(String name) {
        return "hey " + name + ", there is some problem with hi page";
    }
}
