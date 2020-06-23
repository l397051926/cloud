package com.lmx.cloud.feignservice.service;

import com.lmx.cloud.feignservice.config.FeignEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lmx
 * @create: 2020/6/23
 **/
@Service
public class TestService {

    @Autowired
    private FeignEurekaClient feignEurekaClient;

    public String feignTest() {
        return feignEurekaClient.hello();
    }


}
