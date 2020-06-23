package com.lmx.cloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/6/23
 **/
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "hello world";
    }
}
