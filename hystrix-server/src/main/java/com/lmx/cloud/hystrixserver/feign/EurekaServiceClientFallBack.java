package com.lmx.cloud.hystrixserver.feign;

import org.springframework.stereotype.Component;

/**
 * @author: lmx
 * @create: 2020/6/23
 **/
@Component
public class EurekaServiceClientFallBack implements EurekaServiceClient {
    @Override
    public String hello() {
        return "被熔断器 截断  处理了";
    }
}
