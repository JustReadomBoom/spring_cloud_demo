package com.zqz.service.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zqz
 * @Description:
 * @Date: Created in 17:10 2021/1/22
 */
@RestController
public class ProducerTestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/get/port")
    public Object getProducerPort(@RequestParam("name") String name){
        return String.format("Hello %s, this is port:%s producer application", name, port);
    }
}
