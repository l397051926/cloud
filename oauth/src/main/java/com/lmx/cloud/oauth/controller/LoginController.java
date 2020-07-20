package com.lmx.cloud.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/7/19
 **/
@RestController
public class LoginController {

    @GetMapping
    public String test(){
        return "test";
    }

    @PostMapping("/login-sucess")
    public String login(){
        return "登录成功";
    }

}
