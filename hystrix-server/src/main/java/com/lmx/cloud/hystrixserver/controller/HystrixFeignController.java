package com.lmx.cloud.hystrixserver.controller;

import com.lmx.cloud.hystrixserver.service.HystrixFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/6/23
 **/
@RestController
public class HystrixFeignController {

    @Autowired
    private HystrixFeignService hystrixFeignService;

    @GetMapping("/test")
    public String test(){
        return hystrixFeignService.test();
    }

}
