package com.lmx.cloud.hystrixserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HystrixServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixServerApplication.class, args);
    }

}
