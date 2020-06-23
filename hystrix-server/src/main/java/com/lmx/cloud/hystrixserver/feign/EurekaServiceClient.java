package com.lmx.cloud.hystrixserver.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: lmx
 * @create: 2020/6/23
 **/
@FeignClient(value = "eureka-client", fallback = EurekaServiceClientFallBack.class)
public interface EurekaServiceClient {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

}
