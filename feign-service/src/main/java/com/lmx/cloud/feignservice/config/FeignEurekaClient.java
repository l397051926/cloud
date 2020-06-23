package com.lmx.cloud.feignservice.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author: lmx
 * @create: 2020/6/23
 **/
@FeignClient("eureka-client")
public interface FeignEurekaClient {

    @RequestMapping(value = "/hello", method = GET)
    String hello();
}
