package com.lmx.cloud.feignservice.controller;

import com.lmx.cloud.feignservice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/6/23
 **/
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String hello(){
        return "hello world ,this is test";
    }

    @GetMapping("/feign")
    public String feignTest(){
       return testService.feignTest();
    }


}
