package com.zqz.service.consumer.controller;

import com.zqz.service.consumer.service.ConsumerTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zqz
 * @Description:
 * @Date: Created in 17:37 2021/1/22
 */
@RestController
public class ConsumerTestController {

    @Autowired
    private ConsumerTestService consumerTestService;

    @GetMapping("/get/producer")
    public Object getProducerContent(@RequestParam("name") String name){
        return consumerTestService.doGetProducerContent(name);
    }



}
