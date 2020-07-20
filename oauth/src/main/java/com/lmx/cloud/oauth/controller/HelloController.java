package com.lmx.cloud.oauth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/7/19
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "hello shaonian";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAnyRole('admin')")
    public String helloAdmin(){
        return "hello admin";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyRole('user')")
    public String helloUser(){
        return "hello user";
    }

}
