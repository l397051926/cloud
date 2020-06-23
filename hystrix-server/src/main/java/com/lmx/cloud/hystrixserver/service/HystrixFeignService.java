package com.lmx.cloud.hystrixserver.service;

import com.lmx.cloud.hystrixserver.feign.EurekaServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: lmx
 * @create: 2020/6/23
 **/
@Service
public class HystrixFeignService {

    @Autowired
    private EurekaServiceClient eurekaServiceClient;


    public String test() {
       return eurekaServiceClient.hello();
    }



}
