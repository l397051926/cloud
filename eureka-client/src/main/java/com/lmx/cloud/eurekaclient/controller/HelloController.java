package com.lmx.cloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/6/23
 **/
@RestController
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/")
    public String tmp() {
        return "hello world";

    }

    @GetMapping("/hello")
    public String hello() {
        return String.format("hello this is port:%s", port + "");
    }
}
