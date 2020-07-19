package com.lmx.cloud.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/7/19
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello shaonian";
    }

}
